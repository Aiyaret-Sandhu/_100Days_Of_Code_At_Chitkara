# Write your solution here
def printtriange(size):
    k = "*"
    for i in range(1, size +1):
        print(" "*(size-i), end = "")
        print(k)
        k += "**"

def spruce(size):
    print("a spruce!")
    printtriange(size)
    for i in range(size-1):
        print(" ",end="")
    print("*")

# You can test your function by calling it within the following block
if __name__ == "__main__":
    spruce(5)