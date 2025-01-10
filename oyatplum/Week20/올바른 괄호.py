from collections import deque

def solution(s):
    queue = deque()
    for i in s:
        if len(queue) == 0:
            queue.append(i)
        else:
            temp = queue.pop()
            if temp == "(" and i == ")":
                continue
            else:
                queue.append(temp)
                queue.append(i)
    if len(queue) == 0:
        return True
    else:
        return False