package main

import (
	"fmt"
)

func main() {
	// var num int = 123
	var (
		num  int = 123
		num2 int = 234
	)
	const NUM3 = 345
	str := "aaa"
	fmt.Print("num = ", num, " str = ", str, "\n")
	fmt.Println("num =", num, "str =", str)
	fmt.Printf(
		"num = %d str = %s\n",
		num,
		str,
	)
	fmt.Println(num + num2)

	fmt.Println("------------")
	fruit_list := [...]string{"Apple", "Banana"}
	fmt.Println(fruit_list)
	fmt.Println(len(fruit_list))

	fruit_list2 := []string{"Apple", "Banana"}
	fruit_list2 = append(fruit_list2, "Cacao")
	fmt.Println(fruit_list2)
	fmt.Println(len(fruit_list2))

	fmt.Println("------------")
	dict := map[string]int{
		"Japan": 81,
		"Finland": 357,
		"USA": 1,
	}
	fmt.Println(dict)

	delete(dict, "USA")
	fmt.Println(dict)

	_, hasusa := dict["USA"]
	if hasusa{
		fmt.Println("USA found.")
	} else {
		fmt.Println("USA not found.")
	}

	dict["USA"] = 1
	fmt.Println(dict)

	_, hasusa = dict["USA"]
	if hasusa{
		fmt.Println("USA found.")
	} else {
		fmt.Println("USA not found.")
	}




}