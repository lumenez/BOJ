m = int(input())
n = int(input())
d = list([True] * 10001)
a = []

d[0] = False
d[1] = False

for i in range(2, 10001):
    if d[i]:
        for j in range(i + i, 10001, i):
            d[j] = False


for i in range(m, n + 1):
    if d[i]:
        a.append(i)

if sum(a) == 0:
    print(-1)
else:
    print(sum(a))
    print(a[0])