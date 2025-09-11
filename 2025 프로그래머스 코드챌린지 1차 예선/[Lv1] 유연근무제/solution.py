def solution(schedules, timelogs, startday):
    answer = [0 for _ in range(len(schedules))]
    
    for i, time in enumerate(schedules):
        t = time // 100
        m = time % 100
        if m + 10 > 59:
            t += 1
            m -= 60
        time = t * 100 + m + 10
                
        for j in range(len(timelogs[i])):
            d = (j + startday - 1) % 7 + 1
            
            if d >= 6:
                continue
            
            print(time, timelogs[i][j])
            
            if time < timelogs[i][j]:
                answer[i] += 1
                
    return answer.count(0)