import pandas
dataframe = pandas.read_csv("pandasData.csv")
#Print Complete Data
print("Complete_DataSet : ")
print(dataframe)
#Print Username Column Values
print("Usernames : ")
print(dataframe["Usernames"])

print("Credentials in second row : ")
print("Username : " + dataframe["Usernames"][1], " | ""  Password : " + dataframe["Passwords"][1])

#Sort CSV Files based on username
print("Usernames from csv file in ascending order : ")
print(dataframe.sort_values('Usernames'))
print("Usernames from csv file in descending order : ")
print(dataframe.sort_values('Passwords', ascending=False))