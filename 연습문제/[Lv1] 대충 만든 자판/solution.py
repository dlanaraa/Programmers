def solution(keymap, targets):
    answer = []
    key_dic = {}
    
    for key in keymap:
        for i, ch in enumerate(key, start=1):
            key_dic[ch] = min(i, key_dic[ch]) if ch in key_dic else i
    
    for target in targets:
        score = 0
        for ch in target:
            if ch not in key_dic:
                answer.append(-1)
                break
            score += key_dic[ch]
        else:
            answer.append(score)
    
    return answer
