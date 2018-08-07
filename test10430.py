T = input().split()
A = int(T[0])
B = int(T[1])
C = int(T[2])

print((A + B) % C)
print((A % C + B % C) % C)
print((A * B) % C)
print((A % C * B % C) % C)



