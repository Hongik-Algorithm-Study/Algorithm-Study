import sys
input = sys.stdin.readline

l = int(input())
string = list(input())
alphabet_list = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
sum = 0

for i in range(l):
    index = alphabet_list.index(string[i])
    sum += ( index+1 ) * ( 31**i )

print( sum % 1234567891 )