N = int(input())
numList = list(map(int, input().split()))
count = 0;

for i in range(N) :
    if numList[i] == 2 :
        count += 1

    elif numList[i] > 2 :
        for j in range(2, numList[i]+1) :
            if numList[i] % j == 0 :
                if numList[i] == j :
                    count += 1
                break

print(count)