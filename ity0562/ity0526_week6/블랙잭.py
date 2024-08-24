N, M = map(int, input().split())
num_list = list(map(int, input().split()))
max_num = 0

for p in range(0, len(num_list) - 2) :
    for i in range(p+1, len(num_list) - 1) :
        for j in range(i+1, len(num_list)) :
            test_num = num_list[p] + num_list[i] + num_list[j]
            if max_num < test_num and test_num <= M :
                max_num = test_num

print(max_num)