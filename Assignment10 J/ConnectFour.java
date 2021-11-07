public class ConnectFour {
    char[][] board=new char[6][7];
    String turn;
    char token;
    ConnectFour(){
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        turn="Red";
        token='R';
    }
    void nextTurn(){
        if (turn.equals("Red")){
            turn="Yellow";
            token='Y';
        }else{
            turn="Red";
            token='R';
        }
    }
    int nextAvailablePostion(int colNum){
        for (int i = 5; i >=0 ; i--) {
            if(board[i][colNum]==' '){
                return i;
            }
        }
        return -1;
    }
    void dropPiece(int column, char token) throws ColumnFull {
        if(nextAvailablePostion(column)!=-1){
            board[nextAvailablePostion(column)][column]=token;
            nextTurn();
        }else{
            throw new ColumnFull("Column is full try again");
        }
    }
    @Override
    public String toString() {
        String to_return=" 0 1 2 3 4 5 6";
        for(int i=0;i<6;i++) {
            to_return+="\n-----------------------------\n";
            to_return+="| ";
            for(int j=0;j<7;j++) {
                to_return+=board[i][j]+" | ";
            }
        }
        to_return+="\n-----------------------------\n";
        return to_return;
    }

}
