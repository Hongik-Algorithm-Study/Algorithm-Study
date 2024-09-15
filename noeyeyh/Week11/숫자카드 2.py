import sys
input = sys.stdin.readline

n = int(input())
n_list = list(map(int, input().split()))

m = int(input())
m_list = list(map(int, input().split()))

count_dict = {}
for num in n_list:
    if num in count_dict:
        count_dict[num] += 1
    else:
        count_dict[num] = 1

results = []

for num in m_list:
    results.append(count_dict.get(num, 0))  # 존재하지 않으면 0

print(*results)
