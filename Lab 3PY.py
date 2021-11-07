class Quiz:
    def __init__(self):
        self.quiz = []

    def add_question(self):
        question = input("What is the question?\n")
        answer = input("What is the answer?\n")
        difficulty = 0
        while difficulty > 3 or difficulty < 1:
            difficulty = int(input("What is the difficulty?\n"))
            if difficulty > 3 or difficulty < 1:
                print("Invalid Entry. Try Again")
        self.quiz.append(Question(question, answer, difficulty))

    def remove_question(self):
        index = 0
        print("Which question would you like to remove?")
        for x in self.quiz:
            print(str(index) + ".", x.getQuestion())
            index += 1
        remove = int(input())
        if remove > 0 or remove < len(self.quiz):
            self.quiz.pop(remove)
        else:
            print("Invalid entry")
            pass

    def modify_question(self):
        index = 0
        print("Which question would you like to remove?")
        for x in self.quiz:
            print(str(index) + ".", x.getQuestion())
            index += 1
        modify = int(input())
        if modify > len(self.quiz) or modify < 0:
            print("invalid entry")
            pass
        else:
            ques = input("What is the question?\n")
            self.quiz[modify].setQuestion(ques)
            ans = input("What is the answer?\n")
            self.quiz[modify].setAnswer(ans)
            dif = input("What is the difficulty?\n")
            self.quiz[modify].setDifficulty(dif)

    def give_quiz(self):
        correct = 0
        for x in self.quiz:
            ans = input(x.getQuestion() + "\n")
            if ans.lower() == x.getAnswer().lower():
                correct += 1
                print("Correct")
            else:
                print("Incorrect")
        print("You got", str(correct), "out of", len(self.quiz))


class Question:
    def __init__(self, question, answer, difficulty):
        self.__question = question
        self.__answer = answer
        self.__difficulty = difficulty

    def getQuestion(self): return self.__question

    def getAnswer(self): return self.__answer

    def getDifficulty(self): return self.__difficulty

    def setQuestion(self, question):
        self.__question = question

    def setAnswer(self, answer):
        self.__answer = answer

    def setDifficulty(self, difficulty):
        self.__difficulty = difficulty


quiz = Quiz()
selection = 0
while selection != 5:
    print("What would you like to do?")
    print("1. Add a question to the quiz")
    print("2. Remove a question from the quiz")
    print("3. Modify a question in the quiz")
    print("4. Take the quiz")
    print("5. Quit")
    selection = int(input())
    if int(selection) == 1:
        quiz.add_question()
    elif selection == 2:
        quiz.remove_question()
    elif selection == 3:
        quiz.modify_question()
    elif selection == 4:
        quiz.give_quiz()
    elif selection == 5:
        break
    else:
        print("Invalid Entry. Try again.")
