# Write your solution here
def anagrams(a: str , b: str) -> bool :
    if len(a) != len(b) :
        return False
    a = sorted(a)
    b = sorted(b)
    for i in a :
        if i not in b :
            return False
    return True

if __name__ == "__main__":
    print(anagrams("team","meat"))
    print(anagrams("python","java")) 