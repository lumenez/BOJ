T = int(input())
d = list(list(map(int, input().split())) for i in range(T))
isVisited = list([False] * 5 for i in range(T))
print(isVisited)