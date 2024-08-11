N, K = map(int, input().split())

numList = list(range(1,N+1))
index = K-1
yspList = []

while(numList != []) :

    if index < len(numList) :
        yspNum = numList.pop(index)
        yspList.append(yspNum)
    else :
        index %= len(numList)
        yspNum = numList.pop(index)
        yspList.append(yspNum)

    index += K-1

print("<" + ", ".join(map(str, yspList)) + ">")