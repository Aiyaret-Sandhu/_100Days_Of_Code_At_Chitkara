#2310990129_Arshdeep_Singh
#code_for_counting_frequencies

def countFrequency(lst):
    uniqueElements = sorted(set(lst))
    for ele in uniqueElements:
        print(str(ele) + " : " + str(lst.count(ele)))

#code for taking input

inputList = [int(x) for x in input("Enter comma separated list values :- > ").split(",")]
countFrequency(inputList)