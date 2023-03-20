fruits_List = {
    "Banana" : 50,
    "Pomogranate" : 250,
    "Apple": 100,
    "Orange" : 90,
    "Mango" : 150}
fruitNamePriceCheck = input("Enter the Fruit name to Check : ").capitalize().strip()
if (fruitNamePriceCheck in fruits_List):
    print("Given fruit is available in the Fruit Shop")
else:
    print("Given fruit is not available in the Fruit Shop")