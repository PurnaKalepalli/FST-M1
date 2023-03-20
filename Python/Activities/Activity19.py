import pandas
from pandas import ExcelWriter
#Create dataframe
data = {
    'FirstName': ["Lakshmi", "Satya", "Teja"],
    'LastName': ["Veepuri", "Malhothra", "Varma"],
    'Email': ["lakshmi@example.com", "satya@example.com", "teja@example.com"],
    'PhoneNumber': ["9347526996", "9347526997", "9347526998"]
}
#dataframe to Excel
dataframe = pandas.DataFrame(data)
print(dataframe)
writer = ExcelWriter("pandasSampleData.xlsx")
dataframe.to_excel(writer, "Sheet1", index=False)
writer.save()