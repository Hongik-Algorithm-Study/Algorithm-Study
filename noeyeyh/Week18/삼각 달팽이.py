def solution(n):
    t = 1
    x = -1
    y = 0
    result = []
    matrix = [[0] * n for _ in range(n)]

    # 방향 설정: 아래(1, 0), 오른쪽(0, 1), 위쪽(-1, -1)
    directions = [(1, 0), (0, 1), (-1, -1)]  # (dx, dy)

    for i in range(n):
        for j in range(i, n):
            dx, dy = directions[i % 3]  # 현재 방향에 따라 dx, dy 설정

            x += dx
            y += dy

            matrix[x][y] = t
            t += 1

    for i in matrix:
        for j in i:
            if j != 0:
                result.append(j)

    return result