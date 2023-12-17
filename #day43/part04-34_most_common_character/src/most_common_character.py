# Write your solution here
def most_common_character(s: str) -> str :
    maxCount = s.count(s[0])
    maxchar = s[0]
    for i in s :
        if s.count(i) > maxCount :
            maxCount = s.count(i)
            maxchar = i
    return maxchar
    