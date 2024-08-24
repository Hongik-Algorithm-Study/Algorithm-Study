n, k = map(int, input().split())
arr = []
index = 0
result = []

for i in range(n):
	arr.append(i+1)
	
while len(arr) > 0:
	index = (index + k - 1) % len(arr)
	result.append(arr.pop(index))
	
print("<" + ", ".join(map(str, result)) + ">")