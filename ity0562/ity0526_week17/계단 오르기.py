import sys

N = int(sys.stdin.readline())
scores = [0] + [int(sys.stdin.readline()) for _ in range(N)]

dp = [0] * (N+1)

dp[1] = scores[1]
if N > 1:
    dp[2] = scores[1] + scores[2]
if N > 2:
    dp[3] = max(scores[1] + scores[3], scores[2] + scores[3])

for i in range(4, N + 1):
    dp[i] = max(dp[i-2] + scores[i], dp[i-3] + scores[i-1] + scores[i])

print(dp[N])