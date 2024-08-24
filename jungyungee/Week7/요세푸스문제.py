import sys
input = sys.stdin.readline
from collections import deque

n, k = map(int, input().split())
DQ = deque(range(1, n+1))
result = []

while (len(DQ) > 0):
    for i in range(1, k):
        DQ.append(DQ.popleft())
    result.append(DQ.popleft())

print("<", end="")
print(*result, sep=', ', end="")
print(">")