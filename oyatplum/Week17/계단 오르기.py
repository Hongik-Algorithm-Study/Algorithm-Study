import sys
input = sys.stdin.readline

N = int(input())
stairs = [0]*(301)
list = [0]*(301)

for i in range(1, N+1):
    stairs[i] = int(input().strip())

list[1] = stairs[1]
list[2] = stairs[1] + stairs[2]

for i in range(3, N+1):
    list[i] = max((list[i-3] + stairs[i-1] + stairs[i]), (list[i-2] + stairs[i]))

print(list[N])