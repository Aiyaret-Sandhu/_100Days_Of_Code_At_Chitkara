#2310990129_Arshdeep_Singh
#code_for_capitalizing first word in a file

def capitalizeFirstLetter(filePath):
    # Read the content of the file
    with open(filePath, 'r') as file:
        content = file.read()

    # Split the content into words
    words = content.split()

    # Capitalize the first letter of each word
    capitalized_words = [word.capitalize() for word in words]

    # Join the words back into a single string
    capitalized_content = ' '.join(capitalized_words)

    # Write the capitalized content back to the file
    with open(filePath, 'w') as file:
        file.write(capitalized_content)

capitalizeFirstLetter(input("Enter the file path :- > "))