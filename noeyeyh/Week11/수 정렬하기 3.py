import sys
input = sys.stdin.readline

n = int(input())
l = [0 for x in range(10001)]

for i in range(n):
    l[int(input())] += 1

for i in range(10001):
    for j in range(l[i]):
        print(i)