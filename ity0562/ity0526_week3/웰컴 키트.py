import math

N = int(input())
sizeList = list(map(int, input().split()))
T, P = map(int, input().split())

TSet = 0
for i in range(len(sizeList)) :
    if sizeList[i] != 0 :
        TSet += math.ceil(sizeList[i]/T)

print(TSet)
print(N//P, N%P)