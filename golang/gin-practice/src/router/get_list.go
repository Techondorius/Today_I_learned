package router

import (
	"github.com/gin-gonic/gin"
)

func Show_list(c *gin.Context) {
	c.JSON( 200, gin.H{ "message": "list", } )
}