n = int(input())
arr = []

for i in range(n):
    arr.append(list(map(int, input().strip().split())))
    
ranks = []

for i in range(n):
    rank = 1
    for j in range(n):
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            rank += 1
    ranks.append(rank)

print(*ranks)
 