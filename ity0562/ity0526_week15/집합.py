import sys

N = int(sys.stdin.readline())

num_list = [0]*21

for _ in range(N):
    parts = sys.stdin.readline().split()
    op = parts[0]

    if op == 'add':
        num = int(parts[1])
        num_list[num] = 1
    elif op == 'remove':
        num = int(parts[1])
        num_list[num] = 0
    elif op == 'check' :
        num = int(parts[1])
        if num_list[num] == 0:
            print(0)
        else :
            print(1)
    elif op == 'toggle':
        num = int(parts[1])
        if num_list[num] == 0:
            num_list[num] = 1
        else:
            num_list[num] = 0
    elif op == 'all':
        num_list = [1]*21
    else :
        num_list = [0]*21

