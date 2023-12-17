# Write your solution here
def distinct_numbers(lis : list[int]) -> list[int] :
    nlis = []
    for i in lis:
        if i not in nlis :
            nlis.append(i)
    return sorted(nlis)