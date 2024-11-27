def dfs(x, y, graph, visited, n, m):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    visited[x][y] = True

    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and graph[nx][ny] == 1:
            dfs(nx, ny, graph, visited, n, m)


t = int(input())

for _ in range(t):
    m, n, k = map(int, input().split())
    graph = [[0] * m for _ in range(n)]
    visited = [[False] * m for _ in range(n)]

    for _ in range(k):
        x, y = map(int, input().split())
        graph[y][x] = 1

    worm_count = 0

    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1 and not visited[i][j]:
                dfs(i, j, graph, visited, n, m)
                worm_count += 1

    print(worm_count)