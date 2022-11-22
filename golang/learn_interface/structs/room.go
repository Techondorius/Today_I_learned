package structs

type roomID struct {
	roomID string
}

type Room struct {
	roomID roomID
	Users  []string
}

func GenerateRoomID(id string) roomID {
	return roomID{id}
}

func CreateRoom(id string) Room {
	roomID := GenerateRoomID(id)
	return Room{
		roomID: roomID,
		Users:  []string{"A", "B"},
	}

}
