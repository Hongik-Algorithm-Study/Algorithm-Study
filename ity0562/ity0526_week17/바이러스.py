import sys

def dfs(graph, start, visited):
    visited[start] = True
    count = 1
    for neighbor in sorted(graph[start]):
        if not visited[neighbor]:
            count += dfs(graph, neighbor, visited)
    return count

N = int(sys.stdin.readline())
M = int(sys.stdin.readline())

graph = [[] for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [False for _ in range(N+1)]
result = dfs(graph, 1, visited) - 1
print(result)