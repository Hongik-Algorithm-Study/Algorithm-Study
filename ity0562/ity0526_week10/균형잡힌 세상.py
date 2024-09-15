line = input()

while line != '.':
    parenList = []
    lineList = list(line)
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
        print("yes")
    else :
        print("no")


    line = input()
