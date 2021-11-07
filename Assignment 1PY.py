class Coins:
    __quantityOnHand = 0

    def __init__(self, denomination, weight):
        self.__denomination = denomination
        self.__weight = weight

    def getTotalWeight(self):
        return self.__weight * self.__quantityOnHand

    def getTotalValue(self):
        return self.__denomination * self.__quantityOnHand

    def increaseQuantity(self, quantity):
        self.__quantityOnHand += quantity

    def decreaseQuantity(self, quantity):
        if self.__quantityOnHand == 0:
            self.__quantityOnHand = 0
        else:
            self.__quantityOnHand -= quantity

    def getQuantityOnHand(self):
        return self.__quantityOnHand

    def printPretty(self, amount):
        return "${:,.2f}".format(amount)

    def __str__(self):
        return str(self.printPretty(self.getTotalValue())) + " in " + str(self.__denomination) + " coins."


class Notes:
    __quantityOnHand = 0

    def __init__(self, denomination):
        self.__denomination = denomination

    def getTotalValue(self):
        return self.__denomination * self.__quantityOnHand

    def increaseQuantity(self, quantity):
        self.__quantityOnHand += quantity

    def decreaseQuantity(self, quantity):
        if self.__quantityOnHand == 0:
            self.__quantityOnHand = 0
        else:
            self.__quantityOnHand -= quantity

    def getQuantityOnHand(self):
        return self.__quantityOnHand

    def printPretty(self, amount):
        return "${:,.2f}".format(amount)

    def __str__(self):
        return str(self.printPretty(self.getTotalValue())) + " in " + str(self.__denomination) + " notes."


twenties = Notes(20)
tens = Notes(10)
fives = Notes(5)
ones = Notes(1)

quarters = Coins(0.25, 0.2)
dimes = Coins(.1,.08)
nickels = Coins(.05,.176)
pennies = Coins(.01, .088)

dimes.increaseQuantity(41)
nickels.increaseQuantity(17)
pennies.increaseQuantity(132)
ones.increaseQuantity(33)
fives.increaseQuantity(12)
tens.increaseQuantity(2)
twenties.increaseQuantity(5)

print(twenties)
print(tens)
print(fives)
print(ones)
print(quarters)
print(dimes)
print(nickels)
print(pennies)

tMoney= twenties.getTotalValue()
tMoney+= tens.getTotalValue()
tMoney+= fives.getTotalValue()
tMoney+= ones.getTotalValue()
tMoney+= quarters.getTotalValue()
tMoney+= dimes.getTotalValue()
tMoney+= nickels.getTotalValue()
tMoney+= pennies.getTotalValue()

tWeight=quarters.getTotalWeight()
tWeight+=dimes.getTotalWeight()
tWeight+=nickels.getTotalWeight()
tWeight+=pennies.getTotalWeight()
print("Total money is",str(tens.printPretty(tMoney)),"total weight is",str(round(tWeight, 3)),"oz")
print("How much do you need?")
input=input()
request=float(input)
while (request>=20)and(twenties.getQuantityOnHand()>=1):
    print("Give them a $20 Note")
    twenties.decreaseQuantity(1)
    request-=20
while (request>=10)and(tens.getQuantityOnHand()>=1):
    print("Give them a $10 Note")
    tens.decreaseQuantity(1)
    request-=10
while (request>=5)and(fives.getQuantityOnHand()>=1):
    print("Give them a $5 Note")
    fives.decreaseQuantity(1)
    request-=5
while (request>=1)and(ones.getQuantityOnHand()>=1):
    print("Give them a $1 Note")
    ones.decreaseQuantity(1)
    request-=1
while (request>=.25)and(quarters.getQuantityOnHand()>=1):
    print("Give them a quarter")
    quarters.decreaseQuantity(1)
    request-=.25
while (request>=.10)and(dimes.getQuantityOnHand()>=1):
    print("Give them a dime")
    dimes.decreaseQuantity(1)
    request-=.10
while (request>=.05)and(nickels.getQuantityOnHand()>=1):
    print("Give them a nickle")
    nickels.decreaseQuantity(1)
    request-=.05
while (round(request, 2)>=.01)and(pennies.getQuantityOnHand()>=1):
    print("Give them a penny")
    pennies.decreaseQuantity(1)
    request-=.01

tMoney= twenties.getTotalValue()
tMoney+= tens.getTotalValue()
tMoney+= fives.getTotalValue()
tMoney+= ones.getTotalValue()
tMoney+= quarters.getTotalValue()
tMoney+= dimes.getTotalValue()
tMoney+= nickels.getTotalValue()
tMoney+= pennies.getTotalValue()

tWeight=quarters.getTotalWeight()
tWeight+=dimes.getTotalWeight()
tWeight+=nickels.getTotalWeight()
tWeight+=pennies.getTotalWeight()
if request>=.001:
    print("I don't have enough money. I still owe you",tens.printPretty(request))
print("I have",str(tens.printPretty(tMoney)),"left, its total weight is",str(round(tWeight, 3))+"oz")
