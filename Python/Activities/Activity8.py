lst=list(map(int,input("Enter a number into list with comma separated: ").split(',')))
def check(lst):
    if(lst[0] == lst[-1]):
        return True
    return False
print(check(lst))