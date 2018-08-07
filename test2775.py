T = int(input())
d = list(list(range(15)) for i in range(15))

for i in range(1, 15):
    for j in range(1, 15):
        d[i][j] = d[i][j - 1] + d[i - 1][j]

for i in range(0, T):
    k = int(input())
    n = int(input())
    print(d[k][n])

