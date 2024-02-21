t = int(input())

for i in range(t):
    n = int(input())
    quarter = n//25
    dime = (n - quarter*25)//10
    nickel = (n - quarter*25 - dime*10)//5
    penny = (n - quarter*25 - dime*10 - nickel*5)
    print(quarter, dime, nickel, penny)
