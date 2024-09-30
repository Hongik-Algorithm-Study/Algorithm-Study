import  sys

for i in range(3, 0, -1):
    string = sys.stdin.readline().strip()
    if string not in ['Fizz', 'Buzz', 'FizzBuzz']:
        n = int(string) + i

if n%3==0 and n%5==0:
    print('FizzBuzz')
elif n%3==0:
    print('Fizz')
elif n%5==0:
    print('Buzz')
else:
    print(n)