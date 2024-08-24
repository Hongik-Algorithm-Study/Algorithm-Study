import sys
input = sys.stdin.readline

inputNum = int(input())
person_list = []

for i in range(inputNum):
    person = []
    a, b = map(str, input().split())
    person.append(int(a))
    person.append(int(b))
    person_list.append(person)

for i in person_list:
    tall = 0
    for j in person_list:
        if i[0] < j[0] and i[1] < j[1]:
            tall += 1
        else:
            continue
    print(tall + 1, end=" ")