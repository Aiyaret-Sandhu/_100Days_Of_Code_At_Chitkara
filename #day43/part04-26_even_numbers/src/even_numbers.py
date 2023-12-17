# Write your solution here
def even_numbers(lis : list[int]) -> list[int]:
    nlist = []
    for i in lis :
        if i % 2 == 0 :
            nlist.append(i)
    return nlist