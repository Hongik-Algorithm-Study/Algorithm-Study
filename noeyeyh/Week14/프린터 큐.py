from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
results= []

for i in range(n):
  N, M = map(int, input().split())
  q = deque(map(int, input().split()))
  count = 0

  while True:
    if q[0] < max(q):
      if M == 0:
        M = len(q) - 1
      else:
        M -= 1
      q.append(q.popleft())
    else:
      if M != 0:
        q.popleft()
        M -= 1
        count += 1
      else:
        count += 1
        break

  results.append(count)

for i in results:
  print(i)
