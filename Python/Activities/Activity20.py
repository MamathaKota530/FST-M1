import pandas

dataframe = pandas.read_excel("activities/UserDetails.xlsx")

print("No.of rows: " , dataframe.shape[0])
print("No.of columns: " , dataframe.shape[1])
print(dataframe["Email"])
print(dataframe.sort_values("FirstName"))