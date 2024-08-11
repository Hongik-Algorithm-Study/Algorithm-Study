def alpToNum(alp) :
    return ord(alp)-96

L = int(input())
M = 1234567891
r = 31
sum = 0
numList = list(map(alpToNum, input()))

for i in range(0, L) :
    sum += numList[i] * 31**i

print(sum%M)