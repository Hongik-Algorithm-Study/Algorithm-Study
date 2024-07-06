import sys

n = int(input())
arr = sys.stdin.read().split()

arr = list(set(arr))
arr.sort(key=lambda x: (len(x), x))

print(*arr, sep="\n")