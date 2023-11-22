def printInReverse(filePath):
    with open(filePath, 'r') as file:
        content = file.read()

    lines = content.split('.')
    lines = lines[::-1]
    for i in range(1,len(lines)):
        print(lines[i],end =". ")


printInReverse(input("Enter the file path :- > "))