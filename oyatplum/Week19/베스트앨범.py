def solution(genres, plays):
    answer = []
    d1 = {}
    d2 = {}

    for i, (j,k) in enumerate(zip(genres, plays)):
        if j not in d1.keys():
            d1[j] = k
        else:
            d1[j] += k
        if j not in d2.keys():
            d2[j] = [(k,i)]
        else:
            d2[j] += [(k,i)]

    for i,j in sorted(d1.items(), key=lambda x:x[1] ,reverse = True):
        for k,v in sorted(d2[i], key=lambda x:(-x[0], x[1]))[:2]:
            answer.append(v)

    return answer