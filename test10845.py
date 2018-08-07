T = int(input())
a = list()


def push(num):
    a.append(num)


def pop():
    if len(a) > 0:
        return a.pop(0)
    else:
        return -1


def size():
    return len(a)


def empty():
    if len(a) < 1:
        return 1
    else:
        return 0


def front():
    if len(a) > 0:
        return a[0]
    else:
        return -1


def back():
    if len(a) > 0:
        return a[len(a) - 1]
    else:
        return -1


for i in range(1, T + 1):
    msg = input().split()

    if msg[0] == "push":
        push(msg[1])
    if msg[0] == "pop":
        print(pop())
    if msg[0] == "size":
        print(size())
    if msg[0] == "empty":
        print(empty())
    if msg[0] == "front":
        print(front())
    if msg[0] == "back":
        print(back())
