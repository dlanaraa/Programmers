def solution(bandage, health, attacks):
    answer = 0
    
    last_attack = attacks[-1][0]
    max_health = health
    c = 0
    t, x, y = bandage
    
    attack_dic = {a:d for a, d in attacks}
    
    for s in range(last_attack+1):
        if s in attack_dic:
            health -= attack_dic[s]
            if health <= 0:
                return -1
            c = 0
        else:
            health = min(max_health, health + x)
            c += 1
            if c == t:
                health = min(max_health, health + y)
                c = 0
                        
    return health