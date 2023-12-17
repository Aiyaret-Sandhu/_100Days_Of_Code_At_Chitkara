# Write your solution here
i = 1
lis = []

print(f"The list is now {lis}")

while True:
    ask = input("a(d)d, (r)emove or e(x)it: ")
    if ask == "x" :
        print("Bye!")
        break
    elif ask == "r" :
        lis.remove(i-1)
        i -= 1
    elif ask == "d" :
        lis.append(i)
        i = lis[-1] + 1
    print(f"The list is now {lis}")
