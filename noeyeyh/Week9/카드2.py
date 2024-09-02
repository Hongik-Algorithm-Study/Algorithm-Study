from collections import deque

n = int(input())
l = deque(range(1, n + 1))

while len(l) > 1:
    l.popleft()  # 첫 번째 요소 삭제
    l.append(l.popleft())  # 다음 요소를 삭제하고 리스트의 끝으로 이동

print(l[0])