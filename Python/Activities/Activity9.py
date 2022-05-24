list = [2,8,5,9,4,5]
list2 = [10,9,3,8,3]
list3 = []

for i in list:
    if i%2 != 0:
        list3.append(i)

for i in list2:
    if i%2 == 0:
        list3.append(i)

print(list)
print(list2)
print(list3)
