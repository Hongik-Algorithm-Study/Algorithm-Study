import sys
input = sys.stdin.readline

N, M = map(int, input().split())
arr = []
index_map = {}

for i in range(N):
    arr.append(input().strip())

for i in range(N):
    key = arr[i]
    value = i + 1
    index_map[key] = value


for i in range(M):
    query = input().strip()
    
    if query.isdigit():
        index = int(query) - 1
        print(arr[index])

    else:
        print(index_map[query])

