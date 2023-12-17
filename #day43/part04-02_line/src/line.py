# Write your solution here
def line(width , string):
    if string == "" :
        print("*"*width)
    else :
        print(string[0]*width)
        
# You can test your function by calling it within the following block
if __name__ == "__main__":
    line(5, "x")