n = int(input()) #참가자 수
sizelist = list(map(int, input().split())) #사이즈 별 신청자 수
t, p = map(int, input().split()) #정수 티셔츠와 펜의 묶음 수

tnum = 0
for i in range(len(sizelist)):
    if (sizelist[i] % t == 0 ): #티셔츠 개수가 묶음의 배수일 경우
        tnum = tnum + sizelist[i]//t   #묶음 수 만큼 +
    else:
        tnum = tnum + sizelist[i]//t + 1 #나누어떨어지지 않을 경우 몫 +1

pnum = n//p
pextra = n%p

print(tnum)
print(pnum, pextra)