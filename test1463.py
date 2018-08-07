T = int(input())
a = list(range(T+1))

a[1] = 0

for i in range(2, T+1):
    a[i] = a[i - 1] + 1
    if i % 2 == 0:
        a[i] = min(a[i], a[int(i / 2)] + 1)
    if i % 3 == 0:
        a[i] = min(a[i], a[int(i / 3)] + 1)

print(a[T])
