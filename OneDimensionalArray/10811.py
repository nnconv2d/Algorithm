import sys

input = sys.stdin.readline

n, m = map(int, input().rstrip().split())
l = []

for i in range(n):
    l.append(i+1)

for x in range(m):
    i, j = map(int, input().rstrip().split())
    i, j = i-1, j-1
    a = l[:i]
    b = l[i:j+1]
    c = l[j+1:]
    b.reverse()
    l = a+b+c

print(*l)
