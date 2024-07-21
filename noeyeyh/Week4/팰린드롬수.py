while True:
  number = input().strip()
  if number == '0':
    break
  elif number == number[::-1]:
    print("yes")
  else:
    print("no")