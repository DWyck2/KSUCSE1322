import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Notes twenties=new Notes(20);
        Notes tens=new Notes(10);
        Notes fives=new Notes(5);
        Notes ones=new Notes(1);
        Coins quarters=new Coins(0.25f,0.2f);
        Coins dimes=new Coins(0.10f,0.08f);
        Coins nickels=new Coins(0.05f,0.176f);
        Coins pennies=new Coins(0.01f,0.088f);
        dimes.increaseQuantity(41);
        nickels.increaseQuantity(17);
        pennies.increaseQuantity(132);
        ones.increaseQuantity(33);
        fives.increaseQuantity(12);
        tens.increaseQuantity(2);
        twenties.increaseQuantity(5);
        //Note Prints
        System.out.println(twenties);
        System.out.println(tens);
        System.out.println(fives);
        System.out.println(ones);
        //Coin Prints
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);
        //Total Money
        float tMoney;
        tMoney= twenties.getTotalValue();
        tMoney+= tens.getTotalValue();
        tMoney+= fives.getTotalValue();
        tMoney+= ones.getTotalValue();
        tMoney+= quarters.getTotalValue();
        tMoney+= dimes.getTotalValue();
        tMoney+= nickels.getTotalValue();
        tMoney+= pennies.getTotalValue();
        //Coin Weight
        float tWeight;
        tWeight= quarters.getTotalWeight();
        tWeight+= dimes.getTotalWeight();
        tWeight+= nickels.getTotalWeight();
        tWeight+= pennies.getTotalWeight();
        System.out.println("Total Money is "+tens.printPretty(tMoney)+" total weight is "+tWeight+"oz");
        System.out.println("How much do you need?");
        Scanner scan=new Scanner(System.in);
        float request=scan.nextFloat();
        while((request>=20)&&(twenties.getQuantityOnHand()>=1)){
            System.out.println("Give them a $20 Note");
            twenties.decreaseQuantity(1);
            request-=20;
        }
        while((request>=10)&&(tens.getQuantityOnHand()>=1)){
            System.out.println("Give them a $10 Note");
            tens.decreaseQuantity(1);
            request-=10;
        }
        while((request>=5)&&(fives.getQuantityOnHand()>=1)){
            System.out.println("Give them a $5 Note");
            fives.decreaseQuantity(1);
            request-=5;
        }
        while((request>=1)&&(ones.getQuantityOnHand()>=1)){
            System.out.println("Give them a $1 Note");
            ones.decreaseQuantity(1);
            request-=1;
        }
        while((request>=.25)&&(quarters.getQuantityOnHand()>=1)){
            System.out.println("Give them a quarter");
            quarters.decreaseQuantity(1);
            request-=.25f;
        }
        while((request>=.10)&&(dimes.getQuantityOnHand()>=1)){
            System.out.println("Give them a dime");
            dimes.decreaseQuantity(1);
            request-=.10f;
        }
        while((request>=.05)&&(nickels.getQuantityOnHand()>=1)){
            System.out.println("Give them a nickel");
            nickels.decreaseQuantity(1);
            request-=.05f;
        }
        while((request>=.01)&&(pennies.getQuantityOnHand()>=1)){
            System.out.println("Give them a penny");
            pennies.decreaseQuantity(1);
            request-=.01f;
        }
        tMoney= twenties.getTotalValue();
        tMoney+= tens.getTotalValue();
        tMoney+= fives.getTotalValue();
        tMoney+= ones.getTotalValue();
        tMoney+= quarters.getTotalValue();
        tMoney+= dimes.getTotalValue();
        tMoney+= nickels.getTotalValue();
        tMoney+= pennies.getTotalValue();
        tWeight= quarters.getTotalWeight();
        tWeight+= dimes.getTotalWeight();
        tWeight+= nickels.getTotalWeight();
        tWeight+= pennies.getTotalWeight();
        if(request>.001){
            System.out.println("I don't have enought money. I still owe you "+tens.printPretty(request));
        }
        System.out.println("I have "+tens.printPretty(tMoney)+" left, its total weight is "+tWeight+"oz");
    }

}
