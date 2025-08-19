import sys

input = sys.stdin.readline
str = list(input().rstrip())
sec = 0

for i in range(len(str)):
    if str[i] in ['A', 'B', 'C']:
        sec += 3
    elif str[i] in ['D', 'E', 'F']:
        sec += 4
    elif str[i] in ['G', 'H', 'I']:
        sec += 5
    elif str[i] in ['J', 'K', 'L']: 
        sec += 6
    elif str[i] in ['M', 'N', 'O']:
        sec += 7
    elif str[i] in ['P', 'Q', 'R', 'S']:
        sec += 8
    elif str[i] in ['T', 'U', 'V']:
        sec += 9
    else:
        sec += 10

print(sec)
