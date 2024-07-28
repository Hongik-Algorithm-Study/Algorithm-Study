n = int(input())
i = 0
sum = 1

while True:
    if n == 1 :
        print (1)
        break
    elif sum  < n :
        sum = sum + i * 6
        i += 1
    else:
        print (i)
        break