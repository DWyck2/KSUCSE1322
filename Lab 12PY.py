try:
    file1 = open(input("What is the first file?\n"))
    file2 = open(input("What is the second file?\n"))
    lines1 = []
    lines2 = []
    for f in file1:
        lines1.append(f)
    for f in file2:
        lines2.append(f)
    if len(lines1) != len(lines2):
        print("Files have different number of lines")
    else:
        for i in range(len(lines1)):
            if lines1[i] != lines2[i]:
                print("Line", (i + 1))
                print("< ", lines1[i])
                print("> ", lines2[i])
    file1.close()
    file2.close()
except Exception as e:
    print(e)
