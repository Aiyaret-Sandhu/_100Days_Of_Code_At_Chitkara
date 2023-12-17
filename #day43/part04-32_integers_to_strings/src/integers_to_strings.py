# Write your solution here
def formatted(lis : list[float]) -> list[str] :
    newl = []
    for i in lis :
        newl.append(f"{i:.2f}")
    return newl