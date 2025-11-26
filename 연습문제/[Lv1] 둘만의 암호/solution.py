def check_z(ch):
    return 'a' if ch == 'z' else chr(ord(ch) + 1)

def solution(s, skip, index):
    answer = ''

    for x in s:
        for _ in range(index):
            x = check_z(x)
            while x in skip:
                x = check_z(x)
        answer += x
    return answer