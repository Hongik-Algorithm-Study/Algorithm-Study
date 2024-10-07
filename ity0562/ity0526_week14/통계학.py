import sys

N = int(sys.stdin.readline())
num_list = []
num_count = {}

for _ in range(N):
    num = int(sys.stdin.readline())
    num_list.append(num)

    if num not in num_count:
        num_count[num] = 1
    else:
        num_count[num] += 1

num_list.sort()

print(round(sum(num_list) / len(num_list)))

print(num_list[N//2])

freq = max(num_count.values())
num_freq = []
for k, v in num_count.items():
    if v == freq:
        num_freq.append(k)

if len(num_freq) > 1:
    print(sorted(num_freq)[1])
else :
    print(num_freq[0])

print(num_list[-1] - num_list[0])
