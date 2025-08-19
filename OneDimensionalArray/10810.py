n, m = map(int, input().split())
l = []

for i in range(n):
    l.append(0)

for x in range(m):
    i, j, k = map(int, input().split())
    for y in range(i, j+1):
        l[y-1] = k

print(*l)
