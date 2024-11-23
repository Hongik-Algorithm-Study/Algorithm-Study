import sys
input = sys.stdin.readline

N = int(input())
P = list(map(int, input().split()))

P.sort()
min = 0

for i, Ivalue in enumerate(P):
    for j, Jvalue in enumerate(P):
        if j <= i:
            min += Jvalue
print(min)