def solution(n, m, section):
    answer = 0
    cover_end = 0

    for s in section:
        if s > cover_end:
            answer += 1
            cover_end = s + m - 1
            
    return answer