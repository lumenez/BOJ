S = input()
d = list([-1] * 26)
for i in range(0, len(S)):
    pos = ord(S[i]) - 97
    if d[pos] == -1:
        d[pos] = i
for i in range(0, len(d)):
    print(str(d[i]) + ' ', end='')
