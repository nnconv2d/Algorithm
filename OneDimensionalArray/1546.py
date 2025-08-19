import sys

input = sys.stdin.readline

n = int(input().rstrip())
score = input().rstrip()

l = list(map(int, score.split()))

max = max(l)
total = 0

for i in range(n):
    total += l[i]/max * 100

print(total/n)
