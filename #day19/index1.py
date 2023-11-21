def reverse_string(strn):
    lst = strn.split(" ")
    newstr = ""
    for i in lst:
        newstr += i[::-1] + " "
    return newstr

def main() :
    strn = input()
    print(reverse_string(strn))

main()