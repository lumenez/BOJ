T = int(input())
d = list()
a = list(list() for i in range(T))

for i in range(0, T):
    d.append(input())
    for j in range(0, len(d[i])):
        a[i].append(d[i][j])

for i in range(0, T):
    result = 0
    countO = 0
    for j in range(0, len(d[i])):
        if a[i][j] == 'O':
            countO = countO + 1
            result += countO
        else:
            countO = 0
    print(result)