import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(start_x, start_y):
    graphs[start_x][start_y] = 0
    
    for i in range(4):
        nx = start_x + dx[i]
        ny = start_y + dy[i]
        
        if 0 <= nx < y and 0 <= ny < x and graphs[nx][ny] == 1:
            dfs(nx, ny)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

t = int(input())
for _ in range(t):
    x, y, k = map(int, input().split())
    graphs = [[0] * x for _ in range(y)]
    count = 0

    for i in range(k):
        xk, yk = map(int, input().split())
        graphs[yk][xk] = 1
    
    for i in range(y):
        for j in range(x):
            if graphs[i][j] == 1:
                dfs(i, j)
                count += 1

    print(count)
