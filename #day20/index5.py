#ZeroDivisionError exception
def divideNumbers(x, y): 
	try:  
		result = x / y 
		print("Result:", result) 
	except ZeroDivisionError: 
            print("The division by zero operation is not allowed.")  

numerator = int(input("Enter the numerator:- > "))
denominator = int(input("Enter the denominator:- > "))
divideNumbers(numerator, denominator)