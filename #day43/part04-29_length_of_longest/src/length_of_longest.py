# Write your solution here
def length_of_longest(lis : list[str]) -> int:
    longest = len(lis[0])
    for i in range(1, len(lis)):
        if len(lis[i]) > longest:
            longest = len(lis[i])
    return longest