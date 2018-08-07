for i in range(0, 3):
    a = list(map(int, input().split()))
    b = a.count(0)
    result = ''
    if b == 0:
        result = 'E'
    elif b == 1:
        result = 'A'
    elif b == 2:
        result = 'B'
    elif b == 3:
        result = 'C'
    elif b == 4:
        result = 'D'
    print(result)