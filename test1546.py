T = int(input())
d = list(map(int, input().split()))

result = sum(d) / max(d) * 100 / len(d)

print("%0.2f" % result)
