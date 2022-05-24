def fibonacci(number):
    if number <=1:
        return number
    else :
        return fibonacci(number-1) + fibonacci(number-2)

userinput = int(input("Enter a number:"))
# userinput = [5,7]

for i in range(userinput):
    print(fibonacci(i))
# for num in userinput:
#     for i in range(num):
#         print(fibonacci(i))
