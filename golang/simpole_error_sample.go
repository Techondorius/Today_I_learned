package main

import "fmt"

type Myint int

func (m Myint) Error() string{
	return fmt.Sprintf("Error: %d", m)
}

func getError(i int) (int, error){
	return i, Myint(i)
}

func main(){
	fmt.Println(getError(1))
}