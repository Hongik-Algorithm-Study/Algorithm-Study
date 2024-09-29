import sys
input = sys.stdin.readline

def FizzBuzz(n): 
    if n % 15 == 0:
        print("FizzBuzz")
    elif n % 3 == 0:
        print("Fizz")
    elif n % 5 == 0:
        print("Buzz")
    else:
        print(n)

n = 0

for i in range(3, 0, -1):
    x = input().strip()
    if (x != "Fizz" and x != "Buzz" and x != "FizzBuzz"):
        n = int(x) + i

FizzBuzz(n)
