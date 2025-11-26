def solution(cards1, cards2, goal):
    # 목표 돌면서 카드 확인 -> 카드 확인 후 리스트에서 제거
    for msg in goal:
        if cards1 and msg == cards1[0]:
            cards1.pop(0)
        elif cards2 and msg == cards2[0]:
            cards2.pop(0)
        else:
            return "No"
        
    return "Yes"