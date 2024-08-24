import math

n = int(input())
result = math.factorial(n)

string = str(result)[::-1]
count = 0

for i in string:
	if i == '0':
		count += 1
	else: 
		break
		
print(count)