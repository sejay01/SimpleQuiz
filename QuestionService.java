import java.util.Scanner;

public class QuestionService {
    String[] Answer = new String[5];
    Question[] questions = new Question[5];  
    public QuestionService() {
        questions[0] = new Question(1, "What is the output of 2+2 in Java?", "3", "4", "5", "6", "4");
        questions[1] = new Question(2, "Which keyword is used to define a class in Java?", "class", "interface", "struct", "define", "class");
        questions[2] = new Question(3, "Which data type is used to store decimal numbers in Java?", "int", "double", "char", "boolean", "double");
        questions[3] = new Question(4, "What is the default value of an int variable in Java?", "null", "0", "1", "undefined", "0");
        questions[4] = new Question(5, "Which of these is NOT a valid Java loop?", "for", "foreach", "while", "do-while", "foreach");
        
    }



    public void playQuiz(){
        int i=0;
        for(Question q : questions){
        System.out.print(q.getId()+". ");
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc=new Scanner(System.in);
        Answer[i]=sc.nextLine();
        i++;
        }
    }
    public void printScore()
    {
        int score=0;
        for (int i = 0; i < questions.length; i++) {
            Question que= questions[i];
            String crtans=que.getAnswer();
            String userans=Answer[i];
            if(crtans.equals(userans))
            {
                score++;
            }
        }
        System.out.println("Your Score : "+ score);
    }
}
