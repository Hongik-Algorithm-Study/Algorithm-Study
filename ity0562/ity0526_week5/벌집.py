num = int(input())
line = 1
range_num = 1
plus_num = 6
if(num == 1) :
    print(1)
else :
    while(True) :
        line += 1

        if(num <= range_num + plus_num) :
            print(line)
            break

        range_num += plus_num
        plus_num += 6