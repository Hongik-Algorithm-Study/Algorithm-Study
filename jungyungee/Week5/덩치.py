n = int(input())
input_list = []
output_list = []

for i in range (n):
    x, y = map(int, input().split())
    input_list.append([x,y])

rank = 1
for j in range (n):
    for k in range (n):
        if (input_list[j][0] < input_list[k][0]) and (input_list[j][1] < input_list[k][1]) :
            rank += 1
    output_list.append(rank)
    rank = 1

print(*output_list)