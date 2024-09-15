from itertools import count

K = int(input())
numList = []
for _ in range(K):
    N = int(input())

    if N == 0 :
        try :
            numList.pop()
        except IndexError:
            continue
    else :
        numList.append(N)

listSum = sum(numList)

print(listSum)