import math

def solution(progresses, speeds):
    answer = []
    days = []

    for i in range(len(progresses)):
        day = math.ceil((100 - progresses[i]) / speeds[i])
        days.append(day)

    max_day = days[0]
    count = 1

    for i in range(1, len(days)):
        if days[i] <= max_day:
            count += 1
        else:
            answer.append(count)
            max_day = days[i]
            count = 1

    answer.append(count)

    return answer