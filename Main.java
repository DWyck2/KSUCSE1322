import java.util.Scanner;

public class Main {
    static int recursive_multiply(int num1,int num2){
        if (num2==1){
            return num1;
        }
        if (num2==0){
            return num2;
        }
        return num1 + recursive_multiply(num1, num2-1);
    }
    static int recursive_div(int num1, int num2){
        if (num2==0){
            return -1;
        }
        if (num1==num2){
            return 1;
        }
        if (num1<num2){
            return 0;
        }
        return 1 + recursive_div(num1-num2,num2);
    }
    static int recursive_mod(int num1, int num2){
        if (num2==0){
            return -1;
        }
        if (num1<num2){
            return num1;
        }
        return recursive_mod(num1-num2,num2);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Choose from the following:\n" +
                    "0. Quit\n" +
                    "1. Multiply 2 numbers\n" +
                    "2. Div 2 numbers\n" +
                    "3. Mod 2 numbers");
            int input= scan.nextInt();
            if(input==0){
                break;
            }else if(input==1){
                System.out.println("Enter first number");
                int num1= scan.nextInt();
                System.out.println("Enter second number");
                int num2= scan.nextInt();
                System.out.println("Answer: "+recursive_multiply(num1,num2));
            }else if(input==2){
                System.out.println("Enter first number");
                int num1= scan.nextInt();
                System.out.println("Enter second number");
                int num2= scan.nextInt();
                System.out.println("Answer: "+recursive_div(num1,num2));
            }else{
                System.out.println("Enter first number");
                int num1= scan.nextInt();
                System.out.println("Enter second number");
                int num2= scan.nextInt();
                System.out.println("Answer: "+recursive_mod(num1,num2));
            }
        }while(true);

    }
}
