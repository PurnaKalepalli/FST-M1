# Verifying whether first and last number of a list are same
nums = list(input("Enter list of numbers separted by comma without any spaces : ").split(","))
print("Numbers in the given list : ",nums)
if (nums[0] == nums[-1]):
    print ("First and last element are same : ",True)
else:
    print ("First and last element are same : ",False)