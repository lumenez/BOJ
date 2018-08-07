def gcd(a, b):
    if b == 0:
        return a
    else:
        r = int(a % b)
        return gcd(b, r)


m, n = map(int, input().split())
print(gcd(m, n))
print(int(m * n / gcd(m, n)))