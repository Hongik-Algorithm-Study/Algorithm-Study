from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
q = deque()
size = 0

for i in range(n):
    l = list(input().split())

    if l[0] == "push":
        q.append(l[1])
        size += 1

    elif l[0] == "pop":
        if size != 0:
            print(q.popleft())
            size -= 1
        else:
            print(-1)

    elif l[0] == "size":
        print(size)

    elif l[0] == "empty":
        if size:
            print(0)
        else:
            print(1)

    elif l[0] == "front":
        if size != 0:
            print(q[0])
        else:
            print(-1)

    else:
        if size != 0:
            print(q[-1])
        else:
            print(-1)