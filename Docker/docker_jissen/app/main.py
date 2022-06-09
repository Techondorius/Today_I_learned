from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"Hello": "World"}

@app.post('/posttest/')
def posttest(message : str = "0"):
    with open('messages/messages.txt', mode='w') as file:
        file.write(message)
    return {"posted" : message}