list =[]

n = int(input("Enter length of list: "))

for i in range(n):
    number = int(input("Enter a number: "))
    list.append(number)

print(list)
tuple1 = tuple(list)
print(tuple1)

for number in tuple1:
    if number%5 == 0:
        print(number, "is divisible by 5")