import sys
input = sys.stdin.readline

n = int(input())
list = []

for i in range (n):
    a, b = input().split()
    a = int(a)
    list.append([a,b])

list.sort(key=lambda x: x[0])

for a, b in list:
    print(a, b)