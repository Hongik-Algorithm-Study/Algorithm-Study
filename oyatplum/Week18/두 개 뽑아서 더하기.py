def solution(numbers):
    output = set()
    for xIndex, x in enumerate(numbers):
        for yIndex, y in enumerate(numbers):
            if xIndex != yIndex:
                output.add(x+y)
    return sorted(output)