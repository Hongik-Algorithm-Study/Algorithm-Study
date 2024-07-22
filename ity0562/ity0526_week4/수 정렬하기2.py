import sys

N = int(sys.stdin.readline())
num_list = []

for _ in range(N):
    Num = int(sys.stdin.readline())
    num_list.append(Num)

num_list.sort()

for i in num_list :
    print(i)