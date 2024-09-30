import sys
import statistics

def roundNum(a) :
    if a - int(a) >= 0.5 :
        return int(a) + 1
    else :
        return int(a)

N = int(sys.stdin.readline())

if N == 0 :
    print(0)

else :
    trimN = roundNum(N * 0.15)

    numList = [int(sys.stdin.readline().strip()) for _ in range(N)]
    numList.sort()
    trimList = numList[trimN: N - trimN]

    print(roundNum(statistics.mean(trimList)))




