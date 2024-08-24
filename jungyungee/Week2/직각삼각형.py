result_list = []
def pytha(a, b, c):
    if (((a ** 2) + (b ** 2) == (c ** 2)) 
        or ((a ** 2) + (c ** 2) == (b ** 2)) 
        or ((b ** 2) + (c ** 2) == (a ** 2))):
        result_list.append("right")
    else: 
        result_list.append("wrong")

while True:
    a, b, c = map(int,input().split())
    if (a or b or c) >= 30000:
        break
    elif a == 0 and b == 0 and c == 0:
        for i in range(len(result_list)):
            print(result_list[i], sep='\n')
        break
    else:
        pytha(a, b, c)