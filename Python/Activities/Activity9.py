

list1 = tuple(int(a) for a in input ("Enter the List1 of numbers separted by comma without spaces : ").split(","))
list2 = tuple(int(b) for b in input ("Enter the List2 of numbers separted by comma without spaces : ").split(","))
print ("Numbers in List 1 : ",list1)
print ("Numbers in List 2 : ",list2)

list3 = []
#Adding only odd numbers from list1 in list3
for num in list1:
    if (num % 2 != 0) :
        list3.append(num)
    else:
        continue
#Adding only even numbers from list2 in list3
for num in list2:
    if (num % 2 == 0) :
        list3.append(num)
    else:
        continue

print ("Result List having Odd num from List1 and Even Num from List2 : ",list3)