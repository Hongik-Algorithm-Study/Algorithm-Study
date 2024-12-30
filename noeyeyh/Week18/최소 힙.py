import sys
import heapq
input = sys.stdin.readline

n = int(input())
heap = []

for _ in range(n):
    k = int(input().strip())
    if k != 0:
        heapq.heappush(heap, k)
    else:
        if heap:
            temp = heapq.heappop(heap)
            print(temp)
        else:
            print(0)