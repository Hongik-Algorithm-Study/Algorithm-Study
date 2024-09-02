t = int(input())

for i in range(t):
    k = int(input())
    n = int(input())
    l = list(range(1, n + 1))

    for j in range(k):
        for i in range(1, n):
            l[i] += l[i - 1]

    print(l[-1])
