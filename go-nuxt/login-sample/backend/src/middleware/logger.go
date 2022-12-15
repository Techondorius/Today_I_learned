package middleware

import (
	"bytes"
	"encoding/json"
	"io"
	"log"

	"github.com/gin-gonic/gin"
)

func Logger() gin.HandlerFunc {
	return func(c *gin.Context) {
		ByteBody, _ := io.ReadAll(c.Request.Body)
		c.Request.Body = io.NopCloser(bytes.NewBuffer(ByteBody))
		log.Println("Endpoint: " + c.FullPath())
		log.Println("Body: " + string(ByteBody))

		q := c.Request.URL.Query()
		j, _ := json.Marshal(q)
		log.Println("Query Params: " + string(j))

		c.Next()
	}
}
