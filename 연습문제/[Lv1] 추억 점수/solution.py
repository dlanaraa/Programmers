def solution(name, yearning, photo):
    answer = []
    score = {}
    
    for i in range(len(name)):
        score[name[i]] = yearning[i]
        
    for p in photo:
        sums = 0
        for s in p:
            if s in score:
                sums += score[s]
        answer.append(sums)
        
    return answer