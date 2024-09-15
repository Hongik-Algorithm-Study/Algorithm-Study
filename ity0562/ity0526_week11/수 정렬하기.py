import sys

N = int(sys.stdin.readline())

numList = [0] * 10000

for i in range(N):
    numList[int(sys.stdin.readline())-1] += 1

for i in range(10000):
    if numList[i] != 0:
        for j in range(numList[i]):
            print(i+1)