leng = int(input())

lst = [int(x) for x in input().split(" ")]

print(int(round(sum(set(lst))/len(set(lst)))))
