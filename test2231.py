T = int(input())


def sums(num):
    res = num
    while num > 0:
        temp1 = int(num / 10)
        temp2 = temp1 * 10
        temp3 = num - temp2
        res += temp3
        num = int(num / 10)
    return res


a = 0

for i in range(1, T+1):
    result = sums(i)
    if T == result:
        a = i
        break

print(a)
