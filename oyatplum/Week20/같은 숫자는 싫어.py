def solution(arr):
    answer = []
    for i in arr:
        if len(answer) == 0:
            answer.append(i)
        else:
            k = answer.pop()
            if i == k:
                answer.append(i)
            else:
                answer.append(k)
                answer.append(i)
    return answer