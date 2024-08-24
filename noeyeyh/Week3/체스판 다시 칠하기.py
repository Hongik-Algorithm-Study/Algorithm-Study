n, m = map(int,input().split()) 
board=[]
new=[] 

for i in range(n):
    board.append(input())

for i in range(n-7):
    for j in range(m-7):
        white = 0 
        black = 0 
        for a in range(8): 
            for b in range(8): 
                if (a+b) % 2== 0 : 
                    if board[a+i][b+j] != 'W': 
                        white += 1 
                    else: 
                        black += 1 

                else: 
                    if board[a+i][b+j] != 'B': 
                        white += 1 
                    else: 
                        black += 1 

        if white <= black:
            new.append(white)
        else:
            new.append(black)

print(min(new)) 