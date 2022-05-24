list = []
n = int(input("Enter number of elements: "))
for i in range(0,n):
    number = int(input("Enter a number"))
    list.append(number)

print(list)

sum =0
for j in list:
    sum += j

print(sum)