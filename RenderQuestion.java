
import java.util.Scanner;

public class RenderQuestion {

    public static void main(String[] args) {

       

        String questionPrompt1 = "Which programming language powers WordPress?\n"
                                    + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt2 = "What is the building block of all progrmming codes?\n"
                                     + "a) CSS \n b) HTML\n c)JavaScript\n d) PHP\n"; 
        String questionPrompt3 = "Which of the following is not a programming language?\n"
                                    + "a) HTML \n b) C++\n c)JavaScript\n d) PHP\n";
        String questionPrompt4 = "Which programming language powers WordPress?\n"
                                 + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt5 = "Which programming language powers WordPress?\n"
                                 + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt6 = "Which programming language powers WordPress?\n"
                                    + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt7 = "Which programming language powers WordPress?\n"
                                 + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt8 = "Which programming language powers WordPress?\n"
                                 + "a) Java \n b) C++\n c)Python\n d) PHP\n";
        String questionPrompt9 = "Which programming language powers WordPress?\n"
                                    + "a) Java \n b) C++\n c)Python\n d) PHP\n";  
        String questionPrompt10 = "Which programming language powers WordPress?\n"
                                    + "a) Java \n b) C++\n c)Python\n d) PHP\n"; 
         
        
   
        
    Question questionArray []= {
    
            new Question(questionPrompt1, "d"),
            new Question(questionPrompt2, "a"),
            new Question(questionPrompt3, "c"),
            new Question(questionPrompt4, "b"),
            new Question(questionPrompt5, "c"),
            new Question(questionPrompt6, "a"),
            new Question(questionPrompt7, "c"),
            new Question(questionPrompt8, "b"),           
            new Question(questionPrompt9, "d"),
            new Question(questionPrompt10, "c"),  
        }; 
       
    }   

     public static void  doTest(Question questionArray [] ) {
        
        int correctAnswerCount = 0;
        System.out.println("Get ready for the test... Let's go!");
         Scanner keyboardInput = new Scanner(System.in);
            for (int question = 0; question < questionArray.length; question++) {
                System.out.println(questionArray[question].questionPrompt);
                String answer = keyboardInput.nextLine();
                if(answer.equals(questionArray[question].correctAnswer)){
                    correctAnswerCount++;
                    
                }
                keyboardInput.close();
            }
        
    
      
        System.out.println(" Your score in this test is " + correctAnswerCount + "/" + questionArray.length);
   
    } 
           
}
 