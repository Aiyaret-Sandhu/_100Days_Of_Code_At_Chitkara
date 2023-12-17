# Write your solution here
def all_the_longest(lis : list[str]) -> list[str] :
    longest = lis[0]
    for i in range(1, len(lis)) :
        if len(lis[i]) > len(longest):
            longest = lis[i]
    maxlen = len(longest)
    return [x for x in lis if len(x) == maxlen]

# print(all_the_longest(["adele", "mark", "dorothy", "tim", "hedy", "richard"]))