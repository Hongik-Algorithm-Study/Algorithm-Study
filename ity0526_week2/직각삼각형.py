while True :
    nList = list(map(int, input().split()))

    if nList[0]+nList[1]+nList[2] == 0 :
        break;

    nList.sort();
    if nList[0]**2 + nList[1]**2 == nList[2]**2:
        print("right")
    else :
        print("wrong")