import sys
n = int(sys.stdin.readline())
l = list(map(int, sys.stdin.readline().split()))
count = 0

def isPrime(num) :
    if num == 1:
        return False
    if num == 2:
        return True
    
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

for i in range(n):
    if isPrime(l[i]):
        count += 1

print(count)