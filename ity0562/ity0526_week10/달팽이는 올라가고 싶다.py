A, B, V = map(int, input().split())
H = 0

day = (V-A)//(A-B)

if (V-A)%(A-B) == 0 :
    day += 1
else:
    day += 2

print(day)