import sys

input = sys.stdin.readline

l = []

for i in range(28):
    x = input().rstrip()
    l.append(x)

l = list(map(int, l))
l.sort()

for i in range(1, 31):
    if i not in l:
        print(i)
