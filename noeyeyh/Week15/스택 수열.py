import sys
input = sys.stdin.readline

n = int(input())
 
count = 1
stack = []
results = []

for i in range(n):
    num = int(input())

    while count <= num:
        stack.append(count)
        results.append('+')
        count += 1

    if stack[-1] == num:
        stack.pop()
        results.append('-')
    
    else:
        print("NO")
        break

else:
    for i in results:
        print(i)
