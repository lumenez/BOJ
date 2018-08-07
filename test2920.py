d = list(map(int, input().split()))
asc = list(map(int, [1, 2, 3, 4, 5, 6, 7, 8]))
des = list(map(int, [8, 7, 6, 5, 4, 3, 2, 1]))

result = "mixed"

if d == asc:
    result = "ascending"
elif d == des:
    result = "descending"

print(result)