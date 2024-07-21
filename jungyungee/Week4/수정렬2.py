import sys
input = sys.stdin.readline

n = int(input().strip()) #수의 개수
list = []

for i in range (n):
    num = int(input().strip())
    list.append(num)

list.sort()

for j in range (n):
    print(list[j])