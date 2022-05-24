list = []
n = int(input("Enter number of elements: "))
for i in range(0,n):
    number = int(input("Enter a number"))
    list.append(number)

print(list)

firstNumber = list[0]
lastNumber = list[-1]

if (firstNumber == lastNumber):
    print(True)
else:
    print(False)
