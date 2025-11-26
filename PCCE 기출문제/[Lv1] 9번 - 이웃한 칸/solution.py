def solution(board, h, w):
    # board = 보드의 각 칸에 칠해진 색깔 이름이 담긴 리스트
    # 고른 칸의 위치 -> h, w
    # board[h][w] 와 이웃한 칸들 중 같은 색으로 칠해진 칸의 개수 return    
    
    n = len(board)  # 정수를 저장할 변수
    count = 0   # 같은 색으로 색칠 된 칸의 개수를 저장할 변수
    
    # h, w의 변화량 저장
    dh = [0, 1, -1, 0]
    dw = [1, 0, 0, -1]
    
    for i in range(0, 4):
        h_check = h + dh[i]
        w_check = w + dw[i]
        
        if 0 <= h_check < n and 0 <= w_check < n:
            if board[h][w] == board[h_check][w_check]:
                count += 1
    return count