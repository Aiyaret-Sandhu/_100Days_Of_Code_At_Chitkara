# Write your solution here
lis = []

num = int(input("How many items: "))

for i in range(num):
    value = int(input(f"Item {i+1}: "))
    lis.append(value)

print(lis)