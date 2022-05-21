H, W = map(int, input().split())
R, C = map(int, input().split())

output = 4

if H == 1 or W == 1:
    output = 3

if R == 1 or R == H:
    output -= 1
if C == 1 or C == W:
    output -= 1
if H == W == 1:
    output = 0

print(output)