# Write your solution here
while True :
    string = input("Editor: ").lower().strip()

    if string == "visual studio code" :
        print("an excellent choice!")
        break
    
    elif string == "word" or string == "notepad" :
        print("awful")
    
    else :
        print("not good")