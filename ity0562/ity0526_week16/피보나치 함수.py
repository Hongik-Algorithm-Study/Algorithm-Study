import sys

zero_list = [0] * 41
one_list = [0] * 41

zero_list[0] = 1
one_list[1] = 1

T = int(sys.stdin.readline())

for _ in range(T):
    N = int(sys.stdin.readline())
    if N == 0 :
        print(1, 0)
    elif N == 1:
        print(0, 1)
    else:
        for i in range(2, N+1) :
            zero_list[i] = zero_list[i-1] + zero_list[i-2]
            one_list[i] = one_list[i-1] + one_list[i-2]

        print(zero_list[N], one_list[N])


