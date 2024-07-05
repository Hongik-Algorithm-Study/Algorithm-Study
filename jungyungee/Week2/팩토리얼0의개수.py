n = int(input()) #입력
count = 0

for i in range(1, n+1):
    if i % 125 == 0:
        count = count + 3
    elif i % 25 == 0:
        count = count + 2
    elif i % 5 == 0:
        count = count + 1

print(count)