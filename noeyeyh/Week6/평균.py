n = int(input())
l = list(map(int, input(). split()))

s = sum(l)
m = max(l)
average = ((100 * s) / m / n)
print(average)