A, B, C, D, E, F, X = map(int, input().split())

class person():
    def __init__(self, name, run_time, speed, rest_time):
        self.name = name
        self.run_time = run_time
        self.speed = speed
        self.rest_time = rest_time

    def place(self, current_time):
        output = 0
        run_times = current_time // (self.run_time - self.rest_time)
        left_time = current_time % (self.run_time + self.rest_time)
        output += run_times * self.run_time * self.speed
        output += self.speed * min(self.run_time, left_time)
        self.place = output
        return output


person1 = person('Takahashi', A, B, C)
person2 = person('Aoki', D, E, F)

if person1.place(X) > person2.place(X):
    print(person1.name)
elif person1.place(X) < person2.place(X):
    print(person2.name)
else:
    print("Draw")