package main

import "fmt"

type Car struct{
	cc int
	maker string
}

func (c Car) return_greet(msg string) string{
	return fmt.Sprintf("%s! My engine is %d", msg, c.cc)
}

func (c *Car) p_return_greet(msg string) string{
	return fmt.Sprintf("%s! My engine is %d", msg, c.cc)
}

func main(){
	porsche := Car{
		1999, "porsche",
	}
	var p_pointer *Car = &porsche

	fmt.Printf("Address for porsche: %p\n", &porsche)
	fmt.Printf("Address for p_pointer: %p\n", &p_pointer)
	fmt.Printf("Contents in p_pointer: %p\n", p_pointer)

	fmt.Println("Reference address in p_pointer: ", *p_pointer)

	p_pointer.cc = 1000
	// (*p_pointer).cc = 1000の省略形

	fmt.Println(porsche.return_greet("Hi"))
	fmt.Println(p_pointer.return_greet("Hi"))


}