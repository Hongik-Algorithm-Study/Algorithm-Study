blackChess = """
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
"""
blackChessList = [list(blackChess.strip().split('\n')[i]) for i in range(8)]

whiteChess = """
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
"""
whiteChessList = [list(whiteChess.strip().split('\n')[i]) for i in range(8)]

N, M = map(int, input().split())
allList = [list(input()) for _ in range(N)]

leastCount = 64

Nidx = N-7
Midx = M-7

for i in range(Nidx) :
    for j in range(Midx) :
        checkList = [row[j:j+8] for row in allList[i:i+8]]

        bCount = 0
        wCount = 0

        for k in range(8) :
            for l in range(8) :
                if checkList[k][l] != blackChessList[k][l] :
                    bCount += 1
                if checkList[k][l] != whiteChessList[k][l] :
                    wCount += 1

        if bCount <= wCount :
            count = bCount
        else :
            count = wCount

        if count < leastCount :
            leastCount = count

print(leastCount)