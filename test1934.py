T = int(input())


def gcd(a, b):
    r = int(b % a)

    if r == 0:
        return a

    else:
        return gcd(r, a)


for i in range(0, T):
    a = input().split()
    val1 = int(a[0])
    val2 = int(a[1])
    result = int(val1 * val2 / gcd(val1, val2))

    print(result)


