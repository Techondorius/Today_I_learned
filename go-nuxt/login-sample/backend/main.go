package main

import (
	"fmt"
	"log"
	"time"

	"go-nuxt/login-sample/src/middleware"

	"github.com/gin-gonic/gin"
	"github.com/golang-jwt/jwt/v4"
)

func main() {
	fmt.Println("Hello World")
	g := gin.Default()

	// Cors
	g.Use(middleware.CORS())

	// logger
	g.Use(middleware.Logger())

	g.GET("/", func(c *gin.Context) {
		c.JSON(200, "obj any")
	})
	g.GET("/getJWT", GetJWT)
	g.POST("/getJWT", GetJWT)
	g.GET("/checkJWT", CheckJWT)
	g.POST("/checkJWT", CheckJWT)
	g.Run()
}

func GetJWT(c *gin.Context) {
	claims := jwt.MapClaims{
		"user_id": 123456788,
		"exp":     time.Now().Add(time.Hour * 24).Unix(),
	}
	token := jwt.NewWithClaims(jwt.SigningMethodHS256, claims)
	tokenString, _ := token.SignedString([]byte("Miteh"))
	log.Println(tokenString)
	c.JSON(200, gin.H{
		"token": tokenString,
	})
}

func CheckJWT(c *gin.Context) {
	tokenString := c.Request.Header.Get("token")
	token, _ := jwt.Parse(tokenString, func(token *jwt.Token) (interface{}, error) {
		if _, ok := token.Method.(*jwt.SigningMethodHMAC); !ok {
			fmt.Println("err!!!")
			return nil, fmt.Errorf("unexpected signing method: %v", token.Header["alg"])
		}

		return []byte("Miteh"), nil
	})

	if claims, ok := token.Claims.(jwt.MapClaims); ok {
		fmt.Println(claims["user_id"])
		c.JSON(200, claims["user_id"])
	}
}
