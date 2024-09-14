results = []

while True:
  s = input()
    
  if s == '.':
    break

  stack = []
  valid = True 

  for i in s:
    if i == '(' or i == '[':
      stack.append(i)  # 열린 괄호를 스택에 추가
    elif i == ')':
      if stack and stack[-1] == '(':  # 짝이 맞는 경우
        stack.pop()
      else:  # 짝이 맞지 않는 경우
        results.append('no')
        valid = False
        break
    elif i == ']':
      if stack and stack[-1] == '[':  # 짝이 맞는 경우
        stack.pop()
      else:  # 짝이 맞지 않는 경우
        results.append('no')
        valid = False
        break

  if valid:
    if not stack:  # 스택이 비어 있으면 모든 괄호가 닫힌 것
      results.append('yes')
    else:
      results.append('no')


for i in results:
  print(i)
