# Write your solution here
def everything_reversed(lis : list[str]) ->list[str] :
    newl = []
    for i in lis :
        newl.append(i[::-1])
    return newl[::-1]