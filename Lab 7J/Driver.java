import java.util.Scanner;

public class Driver {
    public static void main(String args[]){
        float first;
        float second;
        Calculator calc=new Calculator();
        Scanner scan=new Scanner(System.in);
        int input=0;
        do{
            System.out.println("0 - Exit\n" +
                    "1 - Addition\n" +
                    "2 - Subtraction\n" +
                    "3 - Multiplication\n" +
                    "4 - Division");
            System.out.print("Please Choose an Option: ");
            input= scan.nextInt();
            if(input==0){
                break;
            }else if(input==1){
                System.out.print("Please enter the first number ");
                first= scan.nextFloat();
                System.out.print("Please enter the second number ");
                second=scan.nextFloat();
                System.out.println(calc.add(first,second));
            }else if(input==2){
                System.out.print("Please enter the first number ");
                first= scan.nextFloat();
                System.out.print("Please enter the second number ");
                second=scan.nextFloat();
                System.out.println(calc.subtract(first,second));
            }else if(input==3){
                System.out.print("Please enter the first number ");
                first= scan.nextFloat();
                System.out.print("Please enter the second number ");
                second=scan.nextFloat();
                System.out.println(calc.multiply(first,second));
            }else if(input==4){
                System.out.print("Please enter the first number ");
                first= scan.nextFloat();
                System.out.print("Please enter the second number ");
                second=scan.nextFloat();
                System.out.println(calc.divide(first,second));
            }
        }while(input!=0);
    }
}
