# # num1 = int(input())
# # num2 = int(input())

# # # try:
# # #     print(num1/num2)

# # # except  ZeroDivisionError :
# # #     print("0")

# # print(num1/num2)

# # import os

# # try:
# #     ile = open('file.txt.txt','r')
# #     print(ile.readline())
# #     ile.close()
# # except FileNotFoundError:
# #     print("file not found")

# Write a Python program that prompts the user to input an integer and raises a ValueError exception if the input is not a valid integer.



# try : 
#     n = int(input())
#     if (type(n) == 'int') :
#         print("integer")
# except ValueError :
#     print("not an integer")

# try:
#     l1 = [1,2,3]
#     print(l1.sorte())
# except AttributeError:
#     print("not an attribute")
    


# print(type(8))

# import random

# l1 = [2,3,4,56,68]

# print(random.choice(l1))

import datetime

# date1 = datetime.date(1999,2,23)
# date2 = datetime.date(2000,3,12)

# print(random.randrange(date1,date2))


print(datetime.datetime.now())
print(datetime.date.today())
print(datetime.datetime.now().time())
print(datetime.datetime.now().date())
print(datetime.datetime.now().time().strftime("%H : %M : %S"))
print(datetime.datetime.now().date().strftime("%dth day of %mth month of the year %Y "))

