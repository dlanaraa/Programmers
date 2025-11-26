def solution(wallpaper):
    file = []
    for i, row in enumerate(wallpaper):
        for j, ch in enumerate(row):
            if ch == "#":
                file.append([j, i])
    
    lux = min(p[0] for p in file)
    luy = min(p[1] for p in file)

    rdx = max(p[0] for p in file) + 1
    rdy = max(p[1] for p in file) + 1
    
    return [luy, lux, rdy, rdx]