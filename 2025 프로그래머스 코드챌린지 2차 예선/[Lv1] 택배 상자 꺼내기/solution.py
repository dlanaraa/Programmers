def solution(n, w, num):
    answer = 0
    h = (n//w) + 1

    storage = [[0 for _ in range(w)] for _ in range(h)]

    cnt = 1
    for x in reversed(range(h)):
        if x % 2 == 0:
            for y in range(w):
                if cnt <= n:
                    storage[x][y] = cnt
                    cnt += 1
        else:
            for y in reversed(range(w)):
                if cnt <= n:
                    storage[x][y] = cnt
                    cnt += 1

    pos = None
    for i, row in enumerate(storage):
        for j, col in enumerate(row):
            if col == num:
                pos = (i, j)
                break
        if pos:
            break
    if not pos:
        return 0
    i, j = pos
    
    for r in range(0, i+1):
        if storage[r][j] != 0:
            answer += 1

    return answer