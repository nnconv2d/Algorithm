import sys
import math

input = sys.stdin.readline

a, b, v = map(int, input().split())
sys.stdout.write(str(math.ceil((v-a)/(a-b))+1))
