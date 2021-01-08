package service

import "fmt"

func Service() {

	fmt.Println("requests")

}

type Method string
type RequestUrl string

const (
	GET Method = "GET"
	POST Method = "POST"
	PATCH Method = "PATCH"
	PUT Method = "PUT"
	DELETE Method = "DELETE"
)

const (
	GetUrl RequestUrl = "/get"
	PostUrl RequestUrl = "/post"
	PatchUrl RequestUrl = "/patch"
	PutUrl RequestUrl = "/put"
	DeleteUrl RequestUrl = "/delete"
)