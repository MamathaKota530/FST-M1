fruits ={
    "apple": 50,
    "banana": 5,
    "grapes": 8,
    "guava": 6
}

for fruit in fruits:
    if fruit in "banana":
        print("fruit is available")
        break
    else:
        print("fruit is not available")