#Define fun to calculate Sum for 0 to 10
def calculateSum (num):
    if num >= 0:
        #Recursive Fun Call
        return num + calculateSum (num - 1)
    else:
        return 0
#Call CalculateSum ()
recursiveSumFun = calculateSum(10)
print ("Sum of numbers from  0 to 10 : ",recursiveSumFun)