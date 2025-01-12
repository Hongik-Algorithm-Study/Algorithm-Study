from collections import deque

def solution(s):
    answer = True
    open = deque()

    for i in s:
        if i == "(":
            open.append(i)
        else:
            if open:
                open.pop()
            else:
                answer = False
                break  

    if open:
        answer = False

    return answer