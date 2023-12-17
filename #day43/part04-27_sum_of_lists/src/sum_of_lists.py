# Write your solution here
def list_sum(lisa : list[int] , lisb : list[int]) -> list[int] :
    lis = []
    for i in range(len(lisa)):
        lis.append(lisa[i] + lisb[i])
    return lis

# print(list_sum([1,2,3],[1,2,3]))