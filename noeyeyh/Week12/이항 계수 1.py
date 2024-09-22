import sys
input = sys.stdin.readline

N , K = map(int,input().split())

def factorial(N):
    result = 1
    for i in range(1, N + 1):
        result *= i
    return result

print(factorial(N) // (factorial(K) * factorial(N-K)))
