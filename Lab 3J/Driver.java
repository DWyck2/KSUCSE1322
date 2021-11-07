import java.util.*;

public class Driver {
    public static void main(String args[]){
        Quiz quiz=new Quiz();
        int selection;
        Scanner scan=new Scanner(System.in);
        //Menu

        do{
            System.out.println("What would you like to do?");
            System.out.println("1. Add a question to the quiz");
            System.out.println("2. Remove a question from the quiz");
            System.out.println("3. MOdify a question in the quiz");
            System.out.println("4. Take the quiz");
            System.out.println("5. Quit");
            selection= scan.nextInt();
            scan.nextLine();
           if (selection==1){
               quiz.add_question();
           }else if(selection==2){
               quiz.remove_question();
           }else if(selection==3){
               quiz.modify_question();
           }else if(selection==4){
               quiz.give_quiz();
           }else if(selection==5){
               break;
           }else{
               System.out.println("Invalid Entry. Please try again.");
           }
        }while(selection!=5);
    }
}
