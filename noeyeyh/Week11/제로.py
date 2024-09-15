k = int(input())
l=[]

for i in range(k):
	n = int(input())
	if n != 0:
		l.append(n)
	else: 
		l.pop()
		
print(sum(l))