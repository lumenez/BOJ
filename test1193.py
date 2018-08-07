T = int(input())
a = []
b = []

a.append(0)
b.append(0)
count = 1
while len(a) <= T:
    if count % 2 == 1:
        for i in range(count, 0, -1):
            a.append(i)
        for i in range(1, count + 1):
            b.append(i)
    else:
        for i in range(1, count + 1):
            a.append(i)
        for i in range(count, 0, -1):
            b.append(i)
    count = count + 1

print(str(a[T]) + '/' + str(b[T]))
