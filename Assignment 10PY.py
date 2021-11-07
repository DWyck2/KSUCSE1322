class ColumnFull(Exception):
    pass


class ConnectFour:
    board = [[0 for i in range(7)] for j in range(6)]

    def __init__(self):
        for i in range(len(self.board)):
            for j in range(len(self.board[i])):
                self.board[i][j] = ' '
        self.turn = "Red"
        self.token = 'R'

    def nextTurn(self):
        if self.turn == "Red":
            self.turn = "Yellow"
            self.token = 'Y'
        else:
            self.turn = "Red"
            self.token = 'R'

    def nextAvailablePostion(self, colNum):
        for i in range(5, -1, -1):
            if self.board[i][colNum] == ' ':
                return i
        return -1

    def dropPiece(self, column, token):
        if self.nextAvailablePostion(column) != -1:
            self.board[self.nextAvailablePostion(column)][column] = token
            self.nextTurn()
        else:
            raise ColumnFull("Column is full, try again")

    def __str__(self):
        to_return = " 0 1 2 3 4 5 6"
        for i in range(6):
            to_return += "\n-----------------------------\n"
            to_return += "| "
            for j in range(7):
                to_return += str(self.board[i][j]) + " |"
        to_return += "\n-----------------------------\n"
        return to_return


game = ConnectFour()
drop = -1
while drop != 9:
    try:
        print(game, "\nWhich column would", game.turn, "like to go in (9 to quit)\n")
        drop = int(input())
        if drop == 9:
            break
        game.dropPiece(drop, game.token)
    except ColumnFull as e:
        print(e)
    except Exception as e:
        print(e)
