try:
    file = open(input("What is the file?\n"))
    lines = []
    for f in file:
        lines.append(f)
    print("Lines:", len(lines))
    words = 0
    chars = 0
    for line in lines:
        wordsInLine = line.split(" ")
        for word in wordsInLine:
            if word:
                print(word)
                words += 1
                for i in range(len(word.strip())):
                    if word[i].isalpha():
                        chars += 1
    print("Words:", words)
    print("Chars:", chars)
    file.close()
except Exception as e:
    print(e)
