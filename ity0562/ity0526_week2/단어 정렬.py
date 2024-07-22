import sys

N = int(sys.stdin.readline())
wList = []

for i in range(N) :
    wList.append(sys.stdin.readline().strip())

wList = list(set(wList))
wList.sort()
wList.sort(key = len)

for i in wList :
    print(i)
