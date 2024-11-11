import sys
input = sys.stdin.readline

M = int(input())
S = set()

for i in range(M):
    arr = input().strip().split()

    if len(arr) == 1:
        if arr[0] == 'all':
            for i in range(1, 21):
                S.add(i)
        else:
            S = set()
    else:
        op, num = arr[0], int(arr[1])

        if op == 'add':
            S.add(num)
        elif op == 'remove':
            S.discard(num)
        elif op == 'check':
            if num in S:
                print(1)
            else:
                print(0)
        elif op == 'toggle':
            if num in S:
                S.discard(num)
            else:
                S.add(num)
