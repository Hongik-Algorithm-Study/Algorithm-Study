from collections import defaultdict, deque
import sys

def dfs(graph, start, visited):
    visited[start] = True
    print(start, end=' ')

    for neighbor in sorted(graph[start]):
        if not visited[neighbor]:
            dfs(graph, neighbor, visited)

def bfs(graph, start):
    visited = [False] * len(graph)
    queue = deque([start])
    visited[start] = True

    while queue:
        current = queue.popleft()
        print(current, end=' ')

        for neighbor in sorted(graph[current]):
            if not visited[neighbor]:
                visited[neighbor] = True
                queue.append(neighbor)


N, M, V = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(N+1)]
visited = [False] * (N+1)

for _ in range(M):
    v1, v2 = map(int, sys.stdin.readline().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

dfs(graph, V, visited)
print()

bfs(graph, V)
print()

