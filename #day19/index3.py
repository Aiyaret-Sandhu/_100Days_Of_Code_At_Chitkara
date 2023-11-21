# # d1={"abc":5,"def":6,"ghi":7}
# # print(d1["abc"])

# l=[["a","b","c"],["d","e","f"],["g","h","i"]]
# print(l[1:][1])

lst = input().split(" ")
idx = int(input())
newstr = ""

for i in lst:
    newstr += i[idx]

print(newstr)