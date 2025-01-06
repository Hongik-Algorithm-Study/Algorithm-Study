from collections import Counter

def solution(participant, completion):
    p = Counter(participant)
    c = Counter(completion)
    
    for i in p:
        if p[i] > c[i]:
            return i