	
num_tuple =map(int,input("Enter a number into list with comma separated: ").split(','))
print("Given list is ", num_tuple)
 
# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)