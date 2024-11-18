import sys
input = sys.stdin.readline

T = int(input())
f = [[0] * 2 for i in range(41)]

f[0][0] = 1
f[0][1] = 0
f[1][0] = 0
f[1][1] = 1

for i in range(2, 41):
  f[i][0] = f[i - 1][0] + f[i - 2][0]
  f[i][1] = f[i - 1][1] + f[i - 2][1]

for i in range(T):
  n = int(input())
  print(f[n][0], f[n][1])
