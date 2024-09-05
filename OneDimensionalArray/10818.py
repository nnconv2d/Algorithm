import sys

input = sys.stdin.readline

n = int(input().rstrip())
a = list(map(int, input().rstrip().split()))

print(min(a), max(a))
