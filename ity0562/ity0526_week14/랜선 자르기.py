import sys

K, N = map(int, sys.stdin.readline().split())
num_list = list()
for _ in range(K):
    num_list.append(int(sys.stdin.readline()))

start = 1
end = max(num_list)

while start <= end :
    mid = (start + end) // 2
    line_count = 0
    for i in num_list:
        line_count += i//mid

    if line_count >= N:
        start = mid + 1
    else:
        end = mid - 1

print(end)