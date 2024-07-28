import sys
input = sys.stdin.read

data = input().split()
n = int(data[0])
member_lst = [(int(data[i]), data[i+1]) for i in range(1, len(data), 2)]

member_lst.sort(key=lambda x: x[0])

for age, name in member_lst:
    print(age, name)