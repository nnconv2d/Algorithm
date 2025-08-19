import sys

input = sys.stdin.readline

n = list(input().rstrip())

for i in range(0, len(n)//2+1):
    if n[i] != n[-i-1]:
       print(0)
       break
    if i == (len(n)//2):
        print(1)
