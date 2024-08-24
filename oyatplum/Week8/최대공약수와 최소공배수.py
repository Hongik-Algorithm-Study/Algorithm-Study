import sys
input = sys.stdin.readline

a, b = map(int, input().split())

while True:
    Max = 1
    Min = 1
    for i in range(1, (min(a, b) + 1)):
        if a % i == 0 and b % i == 0:
            Max = i
    print(Max)
    Min = (a // Max) * (b // Max) * Max
    print(Min)
    break