#Define Fun to Call Sum Fun()
def sum(number):
    sum = 0
    for num in number:
        sum = sum + num
    return sum
# Define the list of numbers
list = [10,20,30,40,50]
sumOfNumList = sum(list)
print ("Sum of all elements in list is : ", sumOfNumList)