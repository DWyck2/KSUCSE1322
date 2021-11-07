import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ConnectFour game=new ConnectFour();
        Scanner scan=new Scanner(System.in);
        int input=-1;
        do{
            System.out.println(game.toString()+"\nWhich column would "+game.turn+" like to go in (9 to quit)");
            try{
                input=scan.nextInt();
                if(input==9)
                    break;
                game.dropPiece(input, game.token);
            }catch(ColumnFull e) {
                System.out.println(e.getMessage());
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally {
                scan.nextLine();
            }
        }while(input!=9);
    }
}
