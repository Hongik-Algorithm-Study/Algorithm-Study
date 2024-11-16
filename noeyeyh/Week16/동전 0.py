import sys
input = sys.stdin.readline

n, k = map(int, input().split())
l = [0 for i in range(n)]
count = 0

for i in range(n):
    l.append(int(input()))
l.reverse()

for i in range(n):
    while k >= l[i]:
        k -= l[i]
        count += 1
    if k == 0:
        break

print(count)