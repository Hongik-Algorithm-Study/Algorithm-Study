n = int(input())
i=1
j=0
if n <= 10000:
    num = str(i)
    while j < n:
        if "666" in num:
            j = j + 1
            if j == n:
                print(i)
                break
        i = i + 1
        num = str(i)
