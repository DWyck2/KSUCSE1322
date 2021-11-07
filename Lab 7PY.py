class Calc:
    def add(self, num1, num2):
        pass

    def substract(self, num1, num2):
        pass

    def multiply(self, num1, num2):
        pass

    def divide(self, num1, num2):
        pass


class CalcOp(Calc):
    def add(self, num1, num2):
        return num1 + num2

    def subtract(self, num1, num2):
        return num1 - num2

    def multiply(self, num1, num2):
        return num1 * num2

    def divide(self, num1, num2):
        return num1 / num2


def getInput():
    num1 = float(input("Please enter the first number:"))
    num2 = float(input("Please enter the second number:"))
    return num1, num2


calc = CalcOp()
selection = -1
while selection != 0:
    print("0. Exit\n"
          "1 - Addition\n"
          "2 - Subtraction\n"
          "3 - Multiplication\n"
          "4 - Division")
    selection = int(input("Please choose an Option:"))
    if selection == 1:
        num1, num2 = getInput()
        print(round(calc.add(num1, num2), 3))
    elif selection == 2:
        num1, num2 = getInput()
        print(round(calc.subtract(num1, num2), 3))
    elif selection == 3:
        num1, num2 = getInput()
        print(round(calc.multiply(num1, num2), 3))
    elif selection == 4:
        num1, num2 = getInput()
        print(round(calc.divide(num1, num2), 3))
    elif selection == 0:
        break
    else:
        print("Invalid Entry. Try Again.")
