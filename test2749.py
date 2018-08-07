T = int(input())
d = list(0 for i in range(T+1))
d[0] = 0
d[1] = 1
for i in range(2, T+1):
    d[i] = (d[i-1] + d[i-2]) % 1000000

print(int(d[T] % 1000000))