T = int(input())
last = int((2 * T - 1) / 2)

for i in range(1, T + 1):
    print(' ' * last + '*' * (2 * i - 1))
    last = last - 1
