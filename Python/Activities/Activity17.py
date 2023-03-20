import pandas

# Create a Dictionary that will hold our data
data = {
    "Usernames":["admin","Charles","Deku"],
    "Passwords":["password","Charl13","AllMight"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)

# Print the DataFrame
print(dataframe)
#Write dataframe to CSV File
dataframe.to_csv("pandasData.csv", index=False)