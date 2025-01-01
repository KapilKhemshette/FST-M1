numbers = list(map(int,input("Enter a sequence of comma separated values: ").split(',')))
sum = 0
print(numbers)
for number in numbers:
  sum += number

print(sum)
