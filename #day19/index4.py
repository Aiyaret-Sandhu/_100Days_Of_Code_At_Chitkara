lst1 = [int(x) for x in input().split(" ")]
lst2 = [int(x) for x in input().split(" ")]

lst = []
for x in lst1:
    if x not in lst2:
        lst.append(x)

for y in lst2:
    if (y not in lst1) and (y not in lst):
        lst.append(y)
for x in sorted(lst):
    print(x,end=" ")
print(sum(lst))