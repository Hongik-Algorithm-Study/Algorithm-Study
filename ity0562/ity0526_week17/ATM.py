import sys

N = int(sys.stdin.readline())
P = list(map(int, sys.stdin.readline().split()))

P.sort()
time = 0
sum = 0
for i in P :
    time = time + i
    sum = sum + time

print(sum)
