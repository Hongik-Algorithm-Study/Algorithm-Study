n = int(input())
A = set(map(int, input().split()))

m = int(input())
l = list(map(int, input().split()))

for i in l:
    if i in A:
        print(1)
    else:
        print(0)