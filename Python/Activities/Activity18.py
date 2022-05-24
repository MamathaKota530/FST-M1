import pandas

dataframe = pandas.read_csv("Credentials.csv")

print(dataframe)
print(dataframe["Usernames"])
print(dataframe["Usernames"][1])
print(dataframe["Passwords"][1])
print(dataframe.sort_values("Usernames"))
print(dataframe.sort_values("Usernames", ascending=False))
