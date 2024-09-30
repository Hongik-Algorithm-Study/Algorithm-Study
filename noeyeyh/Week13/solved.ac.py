import sys
input = sys.stdin.readline

def round(number):
  integer = int(number)
  rest = number - integer
    
  if rest >= 0.5:
    return integer + 1
  else:
    return integer
    
number = int(input().rstrip())
level = []

for i in range(number):
  level.append(int(input().rstrip()))

level.sort()
new_number = round(number * 0.15)
count = number - (2 * new_number)

if count <= 0:
  print(0)
else:
  total = sum(level[new_number:number - new_number])
  answer = round(total / count)
  print(answer)
