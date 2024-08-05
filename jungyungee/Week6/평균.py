import sys
input = sys.stdin.readline

n = int(input())
scores = list(map(int, input().split()))
m = max(scores)
sum = 0

for i in range(len(scores)):
    sum = sum + (scores[i]/m * 100)

print(sum/n)