package main

import (
	"fmt"

	"github.com/gin-gonic/gin"
)

type Asdf struct {
	Command string `json:"command"`
	Args    Args   `json:"args"`
}

type Args map[string]string

func (Args) Apple() {
	fmt.Println("Apple")
}

func main() {
	r := gin.Default()
	r.GET("/", index)
	r.Run()
	fmt.Println("asdf")
}

func index(c *gin.Context) {
	a := Asdf{}
	c.ShouldBindJSON(&a)
	if a.Command == "asdf" {
		a.Args.Apple()
	}
	c.JSON(200, a)
}
