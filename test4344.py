T = int(input())

for i in range(1, T + 1):
    a = input().split()
    avg = 0
    student = 0

    for j in range(1, int(a[0]) + 1):
        avg = avg + int(a[j])
    avg = avg / int(a[0])

    for j in range(1, int(a[0]) + 1):
        if int(a[j]) > avg:
            student = student + 1

    student = student * 100
    result = student / int(a[0])

    print("%0.3f" % result + "%")



