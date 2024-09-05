import sys

input = sys.stdin.readline

l = []

for i in range(9):
    l.append(int(input().rstrip()))

print(max(l))
print(l.index(max(l))+1)
