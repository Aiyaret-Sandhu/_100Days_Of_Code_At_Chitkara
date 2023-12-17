# Write your solution here
# Note, that at this time the main program should not be written inside
# if __name__ == "__main__":
# block!

def palindromes(s: str) -> bool :
    return s == s[::-1]

def check():
    while True :
        s = input("Please type in a palindrome: ")
        if palindromes(s) :
            print(f"{s} is a palindrome!")
            break
        else :
            print("that wasn't a palindrome")

check()