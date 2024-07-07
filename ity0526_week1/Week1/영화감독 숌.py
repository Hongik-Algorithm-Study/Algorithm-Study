N = input()
count = 0;
i = 666

while(True) :
    iStr = str(i)

    if("666" in iStr) :
        count += 1
        if(count == int(N)) :
            break

    i += 1

print(i);