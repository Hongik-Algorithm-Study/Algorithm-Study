import sys

N = int(sys.stdin.readline())
NList = list(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())
MList = list(map(int, sys.stdin.readline().split()))

count = {}
for i in NList:
    if i in count:
        count[i] += 1
    else:
        count[i] = 1

for i in MList:
    if i in count:
        print(count[i], end=" ")
    else :
        print(0, end=" ")

