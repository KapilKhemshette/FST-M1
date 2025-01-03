	
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]
listThree=list()
for i in range(len(listOne)):
    if(listOne[i]%2==0):
        listThree.append(listOne[i])
for i in range(len(listTwo)):
    if(listTwo[i]%2!=0):
        listThree.append(listTwo[i])

print(listThree)

