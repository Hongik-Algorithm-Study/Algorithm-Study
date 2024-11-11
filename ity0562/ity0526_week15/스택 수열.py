import sys

N = int(sys.stdin.readline())
push = 0
pop = 0
num_stack = []
op_stack = []
cor = 1

for _ in range(N):
    num = int(sys.stdin.readline())
    if num >= push :
        for _ in range(num - push):
            push += 1
            num_stack.append(push)
            op_stack.append('+')
        pop = num
        num_stack.pop()
        op_stack.append('-')

    else :
        try :
            if num < pop:
                for _ in range(len(num_stack) - num_stack.index(num)) :
                    num_stack.pop()
                    op_stack.append('-')
                    pop = num

            else :
                cor = 0
        except ValueError :
            cor = 0

if cor == 0:
    print("NO")
else :
    for i in op_stack:
        print(i)
