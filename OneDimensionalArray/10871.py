import sys

input = sys.stdin.readline

n, x = map(int, input().rstrip().split())
a = list(map(int, input().rstrip().split()))

for i in range(len(a)):
    if a[i] < x:
        print(a[i], end=" ")
