import sys

input = sys.stdin.readline

tmp = set()

for i in range(10):
    num = int(input().rstrip())
    tmp.add(num%42)

print(len(list(tmp)))
