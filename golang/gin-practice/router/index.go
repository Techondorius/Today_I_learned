package router

import (
	// "github.com/gin-gonic/gin"
	"fmt"
)

func Index(s string) string{
	return fmt.Sprintf("%s, hi!", s)
}