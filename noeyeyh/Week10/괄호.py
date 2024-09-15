t = int(input())
results = []
opened = 0

for _ in range(t):
  s = input()
    
  if s.count('(') != s.count(')'):
    results.append('NO')
    continue  # 개수가 다르면 다음 문자열로 넘어감

  
  for i in s:
    if i == '(':
      opened += 1
    elif i == ')':
      if opened > 0:  # 열린 괄호가 있었으면
        opened -= 1
      else:  # 열린 괄호 없이 닫힌 괄호가 먼저 나온 경우
        results.append('NO')
        break
  else:
    results.append('YES')

for i in results:
    print(i)
