num1, num2 = map(int, input().split())
a = max(num1, num2)
b = min(num1, num2)

while True:
    r = a % b
    a = b
    b = r

    if r == 0:
        break

print(a)
print(int(num1*num2/a))