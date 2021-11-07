def recursive_multiply(num1, num2):
    if num2 == 0:
        return 0
    return num1 + recursive_multiply(num1, num2 - 1)


def recursive_div(num1, num2):
    if num2 == 0:
        return -1
    if num1 == num2:
        return 1
    if num1 < num2:
        return 0
    return 1 + recursive_div(num1 - num2, num2)


def recursive_mod(num1, num2):
    if num2 == 0:
        return -1
    if num1 < num2:
        return num1
    return recursive_mod(num1 - num2, num2)


def get2nums():
    num1 = int(input("Enter first number\n"))
    num2 = int(input("Enter second number\n"))
    return num1, num2


selection = -1
while selection != 0:
    print("0. Quit\n"
          "1. Multiply 2 numbers\n"
          "2. Div 2 numbers\n"
          "3. Mod 2 numbers")
    selection = int(input())
    if selection == 1:
        num1, num2 = get2nums()
        print("Answer:", recursive_multiply(num1, num2))
    elif selection == 2:
        num1, num2 = get2nums()
        print("Answer:", recursive_div(num1, num2))
    elif selection == 3:
        num1, num2 = get2nums()
        print("Answer:", recursive_mod(num1, num2))
    elif selection == 0:
        break
    else:
        print("Invalid Input")
