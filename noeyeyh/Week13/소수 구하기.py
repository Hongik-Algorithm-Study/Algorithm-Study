import sys
n = 10 ** 6
isPrime = [True for x in range(n+1)]
isPrime[0], isPrime[1] = False, False

for i in range(2, int(n**0.5)+1):
    if isPrime[i]:
        for j in range(i*2, n+1, i):
            isPrime[j] = False

m, n = map(int, sys.stdin.readline().split())
for i in range(m, n+1):
    if isPrime[i]:
        print(i)