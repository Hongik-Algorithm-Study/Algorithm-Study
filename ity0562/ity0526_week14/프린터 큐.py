import sys

C = int(sys.stdin.readline())

for _ in range(C) :
    N, M = map(int, sys.stdin.readline().split())
    doc_list = list(map(int, sys.stdin.readline().split()))

    result = 0
    while doc_list :
        if doc_list[0] < max(doc_list) :
            doc_list.append(doc_list[0])
            doc_list.pop(0)

            if M == 0 :
                M = len(doc_list) - 1
            else :
                M -= 1

        else :
            if M == 0 :
                result += 1
                break

            doc_list.pop(0)
            M -= 1
            result += 1

    print(result)

