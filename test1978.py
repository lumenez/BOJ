T = int(input())
a = list(map(int, input().split()))
d = list([True] * 1001)

d[0] = False
d[1] = False
count = 0

for i in range(2, 1001):
    if d[i]:
        for j in range(i + i, 1001, i):
            d[j] = False


for i in range(0, len(a)):
    if d[a[i]]:
        count = count + 1
print(count)