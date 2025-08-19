import sys

input = sys.stdin.readline

n = int(input().rstrip())

for i in range(1, 2*n):
    if i>n:
        i=2*n-i
    print(" "*(n-i), end="")
    print("*"*(2*i-1))
