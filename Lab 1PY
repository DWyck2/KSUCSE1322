def make_forward():
    w, h =13, 4
    pixel=[[0 for x in range(w)] for y in range(h)]
    pixel[0][0] = ' '
    pixel[0][1] = ' '
    pixel[0][2] = '_'
    pixel[0][3] = '_'
    pixel[0][4] = '_'
    pixel[0][5] = '_'
    pixel[0][6] = '_'
    pixel[0][7] = '_'
    pixel[0][8] = ' '
    pixel[0][9] = ' '
    pixel[0][10] = ' '
    pixel[0][11] = ' '
    pixel[0][12] = ' '
    pixel[1][0] = ' '
    pixel[1][1] = '/'
    pixel[1][2] = '|'
    pixel[1][3] = '_'
    pixel[1][4] = '|'
    pixel[1][5] = '|'
    pixel[1][6] = '_'
    pixel[1][7] = '\\'
    pixel[1][8] = '\''
    pixel[1][9] = '.'
    pixel[1][10] = '_'
    pixel[1][11] = '_'
    pixel[1][12] = ' '
    pixel[2][0] = '('
    pixel[2][1] = ' '
    pixel[2][2] = ' '
    pixel[2][3] = ' '
    pixel[2][4] = '_'
    pixel[2][5] = ' '
    pixel[2][6] = ' '
    pixel[2][7] = ' '
    pixel[2][8] = ' '
    pixel[2][9] = '_'
    pixel[2][10] = ' '
    pixel[2][11] = '_'
    pixel[2][12] = '\\'
    pixel[3][0] = '='
    pixel[3][1] = '\''
    pixel[3][2] = '-'
    pixel[3][3] = '('
    pixel[3][4] = '_'
    pixel[3][5] = ')'
    pixel[3][6] = '-'
    pixel[3][7] = '-'
    pixel[3][8] = '('
    pixel[3][9] = '_'
    pixel[3][10] = ')'
    pixel[3][11] = '-'
    pixel[3][12] = '\''
    return pixel

def make_mirror():
    pixel=make_forward()
    w, h = 13, 4
    mirror = [[0 for x in range(w)] for y in range(h)]
    for x in range(len(pixel)):
        for y in range(13):
            if pixel[x][12-y]=='(':
                pixel[x][12-y]=')'
            elif pixel[x][12-y]==')':
                pixel[x][12-y]='('
            elif pixel[x][12-y]=='/':
                pixel[x][12-y]='\\'
            elif pixel[x][12-y]=='\\':
                pixel[x][12-y]='/'
            mirror[x][y]=pixel[x][12-y]
    return mirror

forward = make_forward()
mirror = make_mirror()
#Forward Car
for i in range(len(forward)):
    for j in range(len(forward[i])):
        print(forward[i][j],end="")
    print("")
#Mirror Car
for i in range(len(mirror)):
    for j in range(len(mirror[i])):
        print(mirror[i][j],end="")
    print("")
#Crash
for i in range(len(forward)):
    for j in range(len(forward[i])):
        print(forward[i][j],end="")
    for j in range(len(mirror[i])):
        print(mirror[i][j],end="")
    print("")




