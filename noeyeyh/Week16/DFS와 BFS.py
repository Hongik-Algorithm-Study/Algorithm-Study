import sys
input = sys.stdin.readline

N, M, V = map(int, input().split())

graph = [[0]*(N+1) for i in range(N+1)]

for i in range (M):
  a,b = map(int,input().split())
  graph[a][b] = graph[b][a] = 1

visitedD = [0]*(N+1)
visitedB = [0]*(N+1)

def dfs(V):
  visitedD[V] = 1
  print(V, end=' ')
  for i in range(1, N+1):
    if graph[V][i] == 1 and visitedD[i] == 0:
      dfs(i)

def bfs(V):
  queue = [V]
  visitedB[V] = 1
  while queue:
    V = queue.pop(0)
    print(V, end = ' ')
    for i in range(1, N+1):
      if(visitedB[i] == 0 and graph[V][i] == 1):
        queue.append(i)
        visitedB[i] = 1

dfs(V)
print()
bfs(V)