def solution(n, times):
    a, b = 0, 100000 * 1000000000
    m = 0
    while a < b:
        m = (a + b) // 2

        if is_avalible(n, times, m):
            b = m
        else:
            a = m + 1

    answer = b
    return answer


def is_avalible(n, times, m):
    sum = 0

    for i in times:
        sum += m // i

    if n <= sum:
        return True
    else:
        return False