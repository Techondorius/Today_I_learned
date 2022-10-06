package main

import (
	"fmt"
	"log"

	"github.com/gin-gonic/gin"
)

type Asdf struct {
	Command string `json:"command"`
	Arg     any    `json:"args"`
}

func GenerateApple(a any) int {
	return int(a.(float64))
}
func GeneratePerl(a any) int {
	b := a.(map[string]any)
	log.Println(b)
	return int(b["price"].(float64))
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
	if a.Command == "apple" {
		log.Println(GenerateApple(a.Arg))
	} else if a.Command == "perl" {
		log.Println(GeneratePerl(a.Arg))
	}
	c.JSON(200, a)
}
