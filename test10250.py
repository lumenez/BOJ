T = int(input())

for i in range(0, T):
    d = list(map(int, input().split()))
    y = d[2] % d[0]
    if y == 0:
        y = d[0]
    x = 1
    while d[2] > d[0]:
        x = x + 1
        d[2] = d[2] - d[0]
    print(y * 100 + x)
