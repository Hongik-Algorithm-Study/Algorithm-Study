output = []

while True:
    n = input()
    rev_n = n[::-1]

    if (n == '0'):
        break
    else:
        if (n == rev_n):
            output.append('yes')
        else:
            output.append('no')

for j in output:
    print(j)