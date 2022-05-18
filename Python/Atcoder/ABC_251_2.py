N, W = map(int, input().split())
A = list(map(int, input().split())) + [0, 0]
output = [False] * (W + 1)

for i in range(N+2):
    for j in range(i):
        for k in range(j):
            if A[i] + A[j] + A[k] <= W:
                output[A[i] + A[j] + A[k]] = True

print(output.count(True))