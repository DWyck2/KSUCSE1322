import java.util.*;

//Add Text to all methods
public class Quiz {
    Scanner scan= new Scanner(System.in);
    ArrayList<Question> quiz= new ArrayList<Question>();

    public void add_question(){
        System.out.println("What is the question?");
        String question=scan.nextLine();
        System.out.println("What is the answer?");
        String answer=scan.nextLine();
        int difficuilty;
        do{
            System.out.println("How Difficult (1-3)?");
            difficuilty=scan.nextInt();
            scan.nextLine();
            if((difficuilty>3)||(difficuilty<1))
                System.out.println("Invalid difficuilty, please try again.");
        }while((difficuilty>3)||(difficuilty<1));
        quiz.add(new Question(question,answer,difficuilty));
    }
    public void remove_question(){
        int index=0;
        for(Question ques : quiz){
            System.out.println(index+". "+ques.getQuestion());
            index++;
        }
        int remove= scan.nextInt();
        scan.nextLine();
        if (remove< quiz.size())
            quiz.remove(remove);
        else
            System.out.println("Invalid Entry");
    }
    public void modify_question(){
        int index=0;
        for(Question ques : quiz){
            System.out.println(index+". "+ques.getQuestion());
            index++;
        }
        int modify=scan.nextInt();
        scan.nextLine();
        if(modify< quiz.size()){
            System.out.println("What is the question?");
            String question=scan.nextLine();
            System.out.println("What is the answer?");
            String answer=scan.nextLine();
            System.out.println("How Difficult (1-3)?");
            int difficuilty=scan.nextInt();
            scan.nextLine();
            quiz.get(modify).setQuestion(question);
            quiz.get(modify).setAnswer(answer);
            quiz.get(modify).setDifficulty(difficuilty);
        }else
            System.out.println("Invalid Entry");
    }
    public void give_quiz(){
        int correct=0;
        for(Question ques : quiz){
            System.out.println(ques.getQuestion());
            String answer= scan.nextLine();
            if(answer.equalsIgnoreCase(ques.getAnswer())){
                correct++;
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got "+correct+" out of "+quiz.size());
    }

}