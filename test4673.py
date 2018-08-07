def sums(num):
    res = num
    while num > 0:
        temp1 = int(num / 10)
        temp2 = temp1 * 10
        temp3 = num - temp2
        res += temp3
        num = int(num / 10)
    return res


a = list([False] * 20000)

for i in range(1, 10001):
    result = sums(i)
    a[result] = True

for i in range(1, 10001):
    if not a[i]:
        print(i)