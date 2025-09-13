#take the username and age input
name = input("Enter your name: ")
age = int(input("Enter age:"))

yearwhen100= 2025+(100-age)

print(name+"will turn 100 when +str(yearwhen100)")
print(name+ "will turn 100 in ()".format(yearwhen100))
