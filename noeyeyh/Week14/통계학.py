import sys
input = sys.stdin.readline

n = int(input().strip())
numbers = []

for _ in range(n):
  numbers.append(int(input().strip())) 
numbers.sort()

# 산술평균
a = round(sum(numbers) / n)

# 중앙값
if n % 2 == 0:
    b = (numbers[n // 2 - 1] + numbers[n // 2]) / 2
else:
    b = numbers[n // 2]

# 최빈값
frequency = {}
max_count = 0
mode = []

for num in numbers:
    frequency[num] = frequency.get(num, 0) + 1

for num, count in frequency.items():
    if count > max_count:
        max_count = count
        mode = [num]
    elif count == max_count:
        mode.append(num)  # 동일한 빈도의 숫자 추가

# 최빈값 중 두 번째로 작은 값 선택하기
mode.sort()
if len(mode) >= 2:
    c = mode[1]
else:
    c = mode[0] if mode else None

# 범위
d = max(numbers) - min(numbers)

print(a) 
print(b)    
print(c)   
print(d)
