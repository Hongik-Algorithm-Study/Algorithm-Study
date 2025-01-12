from collections import deque

def solution(arr):
    d = deque()
    d.append(arr[0])
    for i in range(1, len(arr)):
        if arr[i] != d[-1]:
            d.append(arr[i])

    answer = []

    for i in d:
        answer.append(i)

    return answer