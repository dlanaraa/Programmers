def solution(players, callings):
    pos = {p:i for i, p in enumerate(players)}
    for c in callings:
        i = pos[c]
        players[i-1], players[i] = players[i], players[i-1]
        pos[c] -= 1
        pos[players[i]] = i
    return players
