# Copy here code of line function from previous exercise and use it in your solution
def line(width , string):
    if string == "" :
        print("*"*width)
    else :
        print(string[0]*width)
        
def shape(twidth, tchar, sheight , schar):
    for i in range(1, twidth + 1):
        line(i,tchar)
    for i in range(sheight):
        line(twidth,schar)
        
# You can test your function by calling it within the following block
if __name__ == "__main__":
    shape(5, "x", 2, "o")