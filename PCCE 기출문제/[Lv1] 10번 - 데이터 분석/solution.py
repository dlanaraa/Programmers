def solution(data, ext, val_ext, sort_by):
    answer = []
    for c, d, m, r in data:
        item = {"code": c, "date": d, "maximum": m, "remain": r}
        if item[ext] < val_ext:
            answer.append(item)

    answer.sort(key=lambda x: x[sort_by])
    return [list(d.values()) for d in answer]