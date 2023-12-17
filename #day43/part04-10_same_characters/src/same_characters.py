# Write your solution here
def same_chars(string, index1, index2):
    if index1 < len(string) and index2 < len(string) :
        return string[index1] == string[index2]
    return False

# You can test your function by calling it within the following block
if __name__ == "__main__":
    print(same_chars("coder", 1, 10))