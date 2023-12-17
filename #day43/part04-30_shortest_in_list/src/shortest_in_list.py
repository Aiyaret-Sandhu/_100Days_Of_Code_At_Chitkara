# Write your solution here
def shortest(lis : list[str]) -> int:
    longest = lis[0]
    for i in range(1, len(lis)):
        if len(lis[i]) < len(longest):
            longest = lis[i]
    return longest