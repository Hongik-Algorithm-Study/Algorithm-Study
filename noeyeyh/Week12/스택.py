import sys
input = sys.stdin.readline

n = int(input())
stack = []
size = 0
 
for i in range(n):
    l = list(input().split())

    if l[0] == "push":
        stack.append(l[1])
        size += 1
    
    elif l[0] == "pop":
        if size != 0:
            print(stack.pop())
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

    else:
        if size != 0:
            print(stack[-1])
        else:
            print(-1)