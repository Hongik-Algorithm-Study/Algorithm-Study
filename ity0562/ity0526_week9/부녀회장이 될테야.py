T = int(input())

for _ in range(T):
    K = int(input())
    N = int(input())

    floor = [x for x in range(1, N+1)]

    for k in range(K):
        for i in range(1, N):
            floor[i] += floor[i-1]

    print(floor[N-1])
