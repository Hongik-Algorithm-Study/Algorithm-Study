import sys
N = int(sys.stdin.readline())
arr=list(map(int, sys.stdin.readline().split()))
T,P = map(int, sys.stdin.readline().split())

count=0
for i in range(6):
    count+=arr[i]//T
    if (arr[i]%T!=0):
        count+=1
print(count)
print(N//P, N%P)