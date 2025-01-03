lst=list(map(int,input("Enter a number into list with comma separated: ").split(',')))
def sum(lst):
    sum=0
    for i in lst:
        sum=sum+i
    return sum
print("sum of elements in lst",sum(lst))