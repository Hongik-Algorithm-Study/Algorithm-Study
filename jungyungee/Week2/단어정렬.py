word_list =[]
num = int(input()) #입력받은 숫자를 단어의 개수로
for i in range(num):
    word_list.append(input())
    
deleted_list = list(set(word_list)) #중복제거
deleted_list.sort() #길이 순 정렬 전, 알파벳 순 정렬
deleted_list.sort( key=len ) #길이 순 정렬
    
for i in deleted_list: #출력
    print(i)