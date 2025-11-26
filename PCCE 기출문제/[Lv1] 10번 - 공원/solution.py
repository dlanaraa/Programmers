def solution(mats, park):
    h = len(park)
    w = len(park[0]) if h else 0

    dp = [[0]*(w+1) for _ in range(h+1)]
    max_square = 0
    print(dp)

    for i in range(1, h+1):
        for j in range(1, w+1):
            if park[i-1][j-1] == "-1":
                dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])
                if dp[i][j] > max_square:
                    max_square = dp[i][j]

    candidates = [s for s in mats if s <= max_square]
    return max(candidates) if candidates else -1
