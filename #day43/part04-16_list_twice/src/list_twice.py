# Write your solution here
lis = []

while True :
    num = int(input("New item: "))
    if num == 0 :
        print("Bye!")
        break
    lis.append(num)
    print(f"The list now: {lis}")
    print(f"The list in order: {sorted(lis)}")       