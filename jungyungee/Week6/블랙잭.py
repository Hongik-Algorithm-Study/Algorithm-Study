import sys
input = sys.stdin.readline

n, m = map(int, input().split())
cards = list(map(int, input().split()))

i, result = 0, 0
while i < n:
    j = i + 1
    while j < n:
        k = j + 1 
        while k < n:
            sum = cards[i]+cards[j]+cards[k]
            if (sum <= m) and (sum > result):
                result = sum
            sum = 0
            k += 1
        j += 1
    i += 1

print(result)