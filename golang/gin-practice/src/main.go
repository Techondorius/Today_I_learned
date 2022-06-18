package main

import (
	"github.com/gin-gonic/gin"
	"gin-practice/router"
)

func main() {
	r := gin.Default()

	v1 := r.Group("/")
	{
		v1.GET("/", router.Index )
	}

	r.Run()
}