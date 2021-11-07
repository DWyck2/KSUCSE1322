import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args){
        File myFile;
        Scanner userS = new Scanner(System.in);
        Scanner fileScan;
        ArrayList<String> lines=new ArrayList<String>();
        try{
            System.out.println("What is the file?");
            String file= userS.nextLine();
            myFile= new File(file);
            fileScan= new Scanner(myFile);
            while(fileScan.hasNextLine())
                lines.add(fileScan.nextLine());
            System.out.println("Lines: "+lines.size());
            int words=0;
            int chars=0;
            for(String line: lines){
                String[] wordsInLine=line.split(" ");
                for (String word : wordsInLine) {
                    if(!(word.isBlank())){
                        words++;
                        for (int i = 0; i < word.trim().length(); i++)
                            if (Character.isLetter(word.charAt(i)))
                                chars++;
                    }
                }
            }
            System.out.println("Words: "+words+"\n" +
                    "Chars: "+chars);
            fileScan.close();
        }catch(IOException e){
            System.out.println("File Error: "+ e.getMessage());
        }
    }
}
