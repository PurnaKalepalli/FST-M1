from datetime import datetime
inputName = str(input("Enter your Name : "))
inputAge = int(input("Enter your Age : "))
currentYear = datetime.today().year
yearOf100Years = int(currentYear - inputAge)+100
print(inputName+ " will turn 100 years at the year : "+str(yearOf100Years))