import sys

N, M = map(int, sys.stdin.readline().split())
p_list = [0]
p_dict = {}

for i in range(1, N+1):
    name = sys.stdin.readline().strip()
    p_list.append(name)
    p_dict[name] = i

for _ in range(M):
    Q = sys.stdin.readline().strip()
    if Q.isdigit() :
        print(p_list[int(Q)])
    else :
        print(p_dict[Q])

