num = int(input())

while num != 0:
    line = input()
    lineList = list(line)
    parenList = []
    isValid = True

    for i in lineList:
        if i == '(':
            parenList.append(i)
        elif i == '[' :
            parenList.append(i)
        elif i == ')' :
            if not parenList :
                isValid = False
                break
            elif parenList[-1] == '[' :
                isValid = False
                break
            parenList.pop()
        elif i == ']' :
            if not parenList:
                isValid = False
                break
            elif parenList[-1] == '(':
                isValid = False
                break
            parenList.pop()

    if not parenList and isValid:
        print("YES")
    else :
        print("NO")

    num -= 1

