num = int(input())

for i in range(1, num+1) :
    i_sum = sum(map(int, str(i)))
    if(num == i + i_sum) :
        print(i)
        break

    if(i == num):
        print(0)