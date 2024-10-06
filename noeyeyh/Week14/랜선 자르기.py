import sys
input = sys.stdin.readline

k, n = map(int,input().split())
list = [int(input()) for _ in range(k)]

start = 1 
end = max(list)
result = 0

while start <= end:
  mid = (start + end) // 2
  count = 0
    
  for length in list :
    count += length // mid
    
  if count >= n:
    result = mid
    start = mid + 1
  else:
    end = mid - 1

print(result)
