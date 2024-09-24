N, K = map(int, input().split())
num1 = 1
num2 = 1

for i in range(K) :
    num1 *= N
    N -= 1
for j in range(1, K+1) :
    num2 *= j

print(num1//num2)
