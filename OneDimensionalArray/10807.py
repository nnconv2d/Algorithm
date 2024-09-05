import sys

input = sys.stdin.readline

n = int(input().rstrip())
a = list(map(int, input().rstrip().split()))
v = int(input().rstrip())

print(a.count(v))
