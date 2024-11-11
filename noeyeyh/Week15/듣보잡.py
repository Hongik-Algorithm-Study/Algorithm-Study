import sys
input = sys.stdin.readline

N, M = map(int, input().split())
listen = []
touch = set()
both = []

for i in range(N):
    listen.append(input().strip())

for i in range(M):
    touch.add(input().strip())

for i in listen:
    if i in touch:
        both.append(i)

print(len(both))
for i in sorted(both):
    print(i)
