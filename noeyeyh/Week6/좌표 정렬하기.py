n = int(input())
arr = []

for i in range(n):
    arr.append(list(map(int, input().strip().split())))
    
arr.sort()
for i in range(n):
	print(*arr[i])