import java.util.Scanner;

public class Main {
    public static int time(String time) throws InvalidTimeException{
        if(!(time.contains(":"))){
            throw new InvalidTimeException("Enter a valid time");
        }
        String[] sTime=time.split(":",3);
        if(sTime.length!=3)
            throw new InvalidTimeException("Enter a valid time");
        for(String s: sTime){
            if(s.length()>2)
                throw new InvalidTimeException("Enter a valid time");
            for (int i = 0; i < s.length(); i++) {
                if(!(Character.isDigit(s.charAt(i))))
                    throw new InvalidTimeException("Enter a valid time");
            }
        }
        int hour = Integer.parseInt(sTime[0]);
        int minute = Integer.parseInt(sTime[1]);
        int second = Integer.parseInt(sTime[2]);
        if ((hour<0)||(hour>23))
            throw new InvalidTimeException("Hours not valid");
        if ((minute<0)||(minute>59))
            throw new InvalidTimeException("Minutes not valid");
        if ((second<0)||(second>59))
            throw new InvalidTimeException("Seconds not valid");
        return (hour*60*60)+(minute*60)+(second);


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time1=scan.nextLine();
            int firstTime = time(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String time2=scan.nextLine();
            int secTime = time(time2);
            int diff=secTime-firstTime;
            System.out.println("Diffenece in seconds: "+diff);
        }catch(InvalidTimeException e){
            System.out.println(e.getMessage());
        }

    }
}
