n = int(input())

for i in range (n):
    num = sum(map(int, str(i))) + i
    if num == n:
        print(i)
        break
    else:
        num = 0
        i =+ 1

if (num == 0):
    print(0)