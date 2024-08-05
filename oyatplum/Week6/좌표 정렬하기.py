import sys
input = sys.stdin.readline

coordinates = []

N = int(input())

for i in range(N):
    xyList =[]
    a,b = map(int, input().split())
    xyList.append(a)
    xyList.append(b)
    coordinates.append(xyList)

coordinates.sort(key=lambda coordinates: (coordinates[0], coordinates[1]))

for i,j in coordinates:
    print(i, j)