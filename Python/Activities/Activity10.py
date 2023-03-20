#Returning Numbers divisible by 5 from Touple List
toupleList = tuple(int(x) for x in input ("Enter the tuple of numbers :  ").split(","))
print ("Tuple List of numbers given by user : ",toupleList)
print ("Numbers divisible by 5 are : ")
for num in toupleList:
    if(num % 5 == 0):
        print (num)
    else:
        continue
