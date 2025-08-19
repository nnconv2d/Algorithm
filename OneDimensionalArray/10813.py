import sys

input = sys.stdin.readline

n, m = map(int, input().rstrip().split())
l = []
for i in range(n):
    l.append(i+1)

for x in range(m):
    i, j = map(int, input().rstrip().split())
    i, j = i-1, j-1
    temp = l[i]
    l[i] = l[j]
    l[j] = temp

print(*l)
