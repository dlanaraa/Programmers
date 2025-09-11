def change(pos):
    mm, ss = pos.split(":")
    return int(mm), int(ss)

def solution(video_len, pos, op_start, op_end, commands):
    v_mm, v_ss = change(video_len)
    V = v_mm * 60 + v_ss

    s_mm, s_ss = change(op_start)
    e_mm, e_ss = change(op_end)

    def in_open(mm, ss):
        ge_start = (mm > s_mm) or (mm == s_mm and ss >= s_ss)
        le_end   = (mm < e_mm) or (mm == e_mm and ss <= e_ss)
        return ge_start and le_end

    def clamp(total_seconds):
        if total_seconds < 0: total_seconds = 0
        if total_seconds > V: total_seconds = V
        mm, ss = divmod(total_seconds, 60)
        return f"{mm:02d}:{ss:02d}"

    mm, ss = change(pos)
    if in_open(mm, ss):
        pos = op_end

    for command in commands:
        mm, ss = change(pos)
        cur = mm * 60 + ss

        if command == "prev":
            cur -= 10
        elif command == "next":
            cur += 10

        pos = clamp(cur)

        mm, ss = change(pos)
        if in_open(mm, ss):
            pos = op_end

    return pos
