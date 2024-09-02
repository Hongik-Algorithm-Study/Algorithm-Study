S = int(input())

B = 0

while S >= 0 :
    if S % 5 == 0 :
        B += S//5
        print(B)
        break

    B += 1
    S -= 3

else :
    print(-1)