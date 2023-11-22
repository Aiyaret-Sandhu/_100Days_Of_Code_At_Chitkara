#2310990129_Arshdeep_Singh
#code_for_removing_duplicate_values

def remove_duplicates(test_dict):
    # Find the list of all values across all dictionary keys
    all_values = []
    for value_list in test_dict.values():
        all_values.extend(value_list)

    # Find the duplicate values
    duplicates = [value for value in all_values if all_values.count(value) > 1]

    # Remove the duplicate values from the corresponding dictionary values
    for key in test_dict.keys():
        test_dict[key] = [value for value in test_dict[key] if value not in duplicates]

    return test_dict

# Test the function
dict = {}
while (True) :
    key = input("Enter the key, 'quit' exists the program ! :- > ")
    if key == "quit" :
        break
    value = input("Enter the values of type list (space separated) ! :- > ").split(" ")
    dict[key] = value

print(remove_duplicates(dict))