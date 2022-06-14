package main

import "fmt"

func fibonacci() func() int{
	count := 0
	return func() int{
		count ++
		return _fibonacci(count)
	}
}

func _fibonacci(n int) int {
	if n <= 2{return 1}
	return _fibonacci(n - 1) + _fibonacci(n - 2)
}

func main() {
    f := fibonacci()
    for i := 0; i < 10; i++ {
        fmt.Println(f())
    }
}