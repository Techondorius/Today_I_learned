package main

import (
	"fmt"
	"github.com/gin-gonic/gin"
)

func main() {
	fmt.Println("Hello World")
	g := gin.Default()
	g.GET("/", func(c *gin.Context) {
		c.JSON(200, "obj any")
	})
	g.Run()
}
