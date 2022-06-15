// https://go-tour-jp.appspot.com/methods/20

package main

import (
	"fmt"
)

type ErrNegativeSqrt float64

func (e ErrNegativeSqrt) Error() string{
	num := fmt.Sprint(float64(e))
	return fmt.Sprintf("cannot Sqrt negative number: %s", num)
}

func Sqrt(x float64) (float64, error) {
	if x < 0{
		return x, ErrNegativeSqrt(x)
	}
	return 0, nil
}

func main() {
	fmt.Println(Sqrt(2))
	fmt.Println(Sqrt(-2))
}
