package main

import (
	"github.com/gin-gonic/gin"
	"gin-practice/router"
)

func helloV1() gin.HandlerFunc {
	return func(c *gin.Context) {
		c.JSON( 200, gin.H{ "message": router.Index("Hi") } )
	}
}
func helloV2() gin.HandlerFunc {
	return func(c *gin.Context) {
		c.JSON( 200, gin.H{ "message": "hello v2", } )
	}
}
func main() {
	r := gin.Default()
	v1 := r.Group("/v1")
	{
		v1.GET("/hello", helloV1() )
	}
	v2 := r.Group("/v2")
    {
        v2.GET("/hello", helloV2() )
	}
	r.Run()
}