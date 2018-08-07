m, n = map(int, input().split())
d = list([True] * 1000001)

d[0] = False
d[1] = False

for i in range(2, 1000001):
    if d[i]:
        for j in range(i + i, 1000001, i):
            d[j] = False

for i in range(m, n + 1):
    if d[i]:
        print(i)