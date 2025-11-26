def find_S(park):
    for y, row in enumerate(park):
        for x, ch in enumerate(row):
            if ch == "S":
                return y, x

def solution(park, routes):
    H, W = len(park), len(park[0])
    y, x = find_S(park)

    for route in routes:
        d, m = route.split()
        m = int(m)

        if d == "E":
            nx = x + m
            if nx < W and "X" not in park[y][x+1:nx+1]:
                x = nx
        elif d == "W":
            nx = x - m
            if nx >= 0 and "X" not in park[y][nx:x]:
                x = nx
        elif d == "S":
            ny = y + m
            if ny < H and all(park[k][x] != "X" for k in range(y+1, ny+1)):
                y = ny
        elif d == "N":
            ny = y - m
            if ny >= 0 and all(park[k][x] != "X" for k in range(ny, y)):
                y = ny

    return [y, x]