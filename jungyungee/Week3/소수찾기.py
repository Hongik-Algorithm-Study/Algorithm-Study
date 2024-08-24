n = input() #정수 개수
numbers = list(map(int, input().split())) #입력 받은 수 list
prime = 0 #소수 개수
divisor = 0 #약수 개수

for i in numbers:
    if ( i >= 2 ):
        for j in range (i):
            if ( i % (j+1) ) == 0:
                divisor = divisor + 1
        if ( divisor == 2 ):
            prime = prime + 1
        divisor = 0

print(prime)