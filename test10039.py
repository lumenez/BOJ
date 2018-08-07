d = list(int(input()) for i in range(5))

result = 0

for i in range(0, 5):
    if d[i] <= 40:
        d[i] = 40

    result += d[i]

print(int(result/5))