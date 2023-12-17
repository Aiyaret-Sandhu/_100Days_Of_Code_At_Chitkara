# Copy here code of line function from previous exercise
def line(width , string):
    if string == "" :
        print("*"*width)
    else :
        print(string[0]*width)

def square_of_hashes(size):
    # You should call function line here with proper parameters
    num = size
    while size > 0 :
        line(num, "#")
        size -= 1

# You can test your function by calling it within the following block
if __name__ == "__main__":
    square_of_hashes(5)
