from itertools import combinations

n, m = map(int, input().split())
l = list(map(int, input().split()))
result = 0

for a, b, c in combinations(l, 3):
    if a + b + c > m:
        continue
    result = max(result, a + b + c)

print(result)