n = int(input())
string = input()

arr = []
result = 0

M = 1234567891  # 큰 소수로 모듈러 값을 설정

for i in string:
  arr.append(ord(i) - ord('a') + 1)
    
for i in range(len(arr)):
  result += (arr[i] * (31**i))
    
print(result % M)