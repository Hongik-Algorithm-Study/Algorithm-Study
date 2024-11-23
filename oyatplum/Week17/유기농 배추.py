import sys
input = sys.stdin.readline
from collections import deque

T = int(input())

x = [0,1,0,-1]
y = [1,0,-1,0]
output = []
def bfs(i,j, graph):
    q = deque()
    q.append([i,j])
    graph[i][j] = 0

    while q:
        k, l = q.popleft()
        for i in range(4):
            cx = x[i] + k
            cy = y[i] + l
            if 0 <= cx < M and 0 <= cy < N and graph[cx][cy] == 1:
                q.append([cx, cy])
                graph[cx][cy] = 0

for _ in range(T):
    M, N, K = map(int, input().split())
    graph = [[0]*N for _ in range(M)]
    for _ in range(K):
        a,b = map(int, input().split())
        graph[a][b] = 1
    count = 0
    for i in range(M):
        for j in range(N):
            if graph[i][j] == 1:
                bfs(i,j, graph)
                count += 1
    output.append(count)

for i in output:
    print(i)