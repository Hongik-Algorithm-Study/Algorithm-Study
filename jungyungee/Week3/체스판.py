n, m = map(int, input().split())    #체스판 크기 입력
board = [[0 for i in range (m)] for j in range (n)]     #입력 받은 크기 만큼의 체스판을 위한 2차원 배열 생성
for i in range (n):     #입력 받은대로 board 채워넣기
    board[i] = list(input())

check = [[0 for i in range (8)] for j in range (8)] #색칠 개수 검사를 위한 함수에서 쓸 배열 선언
cnt_list = [] #바꿀 칸 수들 저장할 리스트(이 중 최솟값을 선택)

def color(check):
    before_start_color = 0
    cnt = 0 #색 바꿔야하는 칸의 개수
    cnt_compare = [] #맨 왼쪽 윗칸이 W인 경우와 B인 경우에 따른 cnt 저장할 리스트
    for start in ['W', 'B']:
        cnt = 0
        for i in check:
            if ((start == 'B') or (before_start_color == 'W')):
                before_start_color = 'B'
                start = 0
                for j in i[0::2]:
                    if ( j != 'B'):
                        cnt += 1
                for j in i[1::2]:
                    if ( j!= 'W'):
                        cnt += 1
            elif ((start == 'W') or (before_start_color == 'B')):
                before_start_color = 'W'
                start = 0
                for j in i[0::2]:
                    if ( j != 'W'):
                        cnt += 1
                for j in i[1::2]:
                    if ( j!= 'B'):
                        cnt += 1
        cnt_compare.append(cnt) #두 경우에 따른 cnt를 비교를 위한 cmt_compare에 저장
        cnt = min(cnt_compare) # 두 경우 중 작은 값을 cnt에 저장
    
    cnt_list.append(cnt)

#가능한 8*8의 경우
j, k, l, c = 0, 0, 0, 0
while l <= (m-8):
    while j <= (n-8) :
        while k < (8+j) :
            check[c] = board[k][l:l+8]
            k += 1
            c += 1
        color(check)
        j += 1
        k = j
        c = 0
    j = 0
    k = 0
    l += 1

print(min(cnt_list)) #구해진 바꿀 칸 수(cnt)들 중 최솟값 선택