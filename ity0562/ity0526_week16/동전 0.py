import sys

N, K = map(int, sys.stdin.readline().split())
count = 0
coin_list = []
for _ in range(N) :
    coin_list.append(int(sys.stdin.readline()))

for i in reversed(coin_list) :
    count += K // i
    K %= i

print(count)