import math

N, K = map(int, input().split())
A = list(map(int, input().split()))
zahyou = [list(map(int, input().split())) for _ in range(N)]

output = 0
for i, j in enumerate(zahyou):
    if i+1 in A:
        pass
    else:
        min_r = 100000000
        for k in A:
            a = (zahyou[k-1][0] - j[0]) ** 2 + (zahyou[k-1][1] - j[1]) ** 2
            min_r = min(math.sqrt(a), min_r)

        output = max(output, min_r)

print(output)