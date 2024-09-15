a, b, v = map(int, input().split())
days=1

if v <= a:
	print(days)
elif (v - b) % (a - b) == 0:
  days = (v - b) // (a - b)
  print(days)
else:
  days = (v - b) // (a - b) + 1
  print(days)