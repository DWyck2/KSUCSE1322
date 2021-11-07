import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args){
        File myFile;
        File myFile2;
        Scanner userS = new Scanner(System.in);
        Scanner scan;
        Scanner scan2;
        ArrayList<String> lines1=new ArrayList<String>();
        ArrayList<String> lines2=new ArrayList<String>();
        try{
            System.out.println("What is the first file?");
            String file1=userS.nextLine();
            System.out.println("What is the second file?");
            String file2= userS.nextLine();
            myFile = new File (file1);
            myFile2 = new File (file2);
            scan = new Scanner(myFile);
            scan2 = new Scanner(myFile2);
            while(scan.hasNextLine())
                lines1.add(scan.nextLine());
            while(scan2.hasNextLine())
                lines2.add(scan2.nextLine());
            if(lines1.size()!= lines2.size())
                System.out.println("Files have different number of lines");
            else{
                for (int i = 0; i < lines1.size(); i++) {
                    if(!(lines1.get(i).equals(lines2.get(i)))){
                        System.out.println("Line "+(i+1)+"\n" +
                                "< "+lines1.get(i)+"\n" +
                                "> "+lines2.get(i));
                    }
                }
            }
            scan.close();
            scan2.close();
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
