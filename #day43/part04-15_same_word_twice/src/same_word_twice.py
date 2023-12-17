# Write your solution here
lis = []

while True :
    word = input("Word: ")
    if word in lis :
        print(f"You typed in {len(lis)} different words")
        break
    lis.append(word)