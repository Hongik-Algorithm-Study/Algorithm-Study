import sys

N = int(sys.stdin.readline())
user_list = []

for _ in range(N):
    age, name = sys.stdin.readline().split()
    age = int(age)
    user_list.append([age, name])

user_list.sort(key= lambda x:x[0])

for i in range(N):
    print(user_list[i][0], user_list[i][1])