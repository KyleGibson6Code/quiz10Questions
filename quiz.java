package newQuiz;
import java.util.Scanner;
import java.util.Scanner;

public class quiz {
public static void main(String[] args) {
   //list of questions
	String q1 = "What is the capital of Georgia?";
    String q2 = "How many sides does a square have?";
    String q3 = "What color is the sky?";
    String q4 = "What is the oppisite of up?";
    String q5 = "What is the opposite of a dog?";
    String q6 = "Which one of these things are not related directly to technology";
    String q7 = "What is 1 + 1?";
    String q8 = "What is 2 + 2?";
    String q9 = "What is 3 + 3?";
    String q10 = "What is 4 + 1?";
  
    //list of answers
   String a1 = "b";
   String a2 = "c";
   String a3 = "b";
   String a4 = "a";
   String a5 = "c";
   String a6 = "a";
   String a7 = "c";
   String a8 = "a";
   String a9 = "a";
   String a10 = "b";
   
   
   
 
   int score=0;



   

   		Scanner start = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to the Quiz");
        System.out.println("Press 1 to begin");
        int response=start.nextInt();

        
        
        if(response == 1) {
        	//question 1
            for(int i = 0; i < 1; i++) {
            	System.out.println(q1);
            	System.out.println("a. Dallas");
                System.out.println("b. Atlanta");
                System.out.println("c. Hiram");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a1, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 2
            for(int i = 0; i < 1; i++) {
            	System.out.println(q2);
            	System.out.println("a. 3");
                System.out.println("b. 6");
                System.out.println("c. 4");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a2, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 3
            for(int i = 0; i < 1; i++) {
            	System.out.println(q3);
            	System.out.println("a. Red ");
                System.out.println("b. Blue");
                System.out.println("c. Yellow");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a3, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 4
            for(int i = 0; i < 1; i++) {
            	System.out.println(q4);
            	System.out.println("a. Down ");
                System.out.println("b. Left ");
                System.out.println("c. Right ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a4, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 5
            for(int i = 0; i < 1; i++) {
            	System.out.println(q5);
            	System.out.println("a. Hamster ");
                System.out.println("b. Rabbit ");
                System.out.println("c. Cat ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a5, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 6
            for(int i = 0; i < 1; i++) {
            	System.out.println(q6);
            	System.out.println("a. Ant ");
                System.out.println("b. Computer");
                System.out.println("c. Iphone ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a6, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 7
            for(int i = 0; i < 1; i++) {
            	System.out.println(q7);
            	System.out.println("a. 70");
                System.out.println("b. 39");
                System.out.println("c. 2 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a7, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 8
            for(int i = 0; i < 1; i++) {
            	System.out.println(q8);
            	System.out.println("a. 4 ");
                System.out.println("b. 91 ");
                System.out.println("c. 66 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a8, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            
            //question 9
            for(int i = 0; i < 1; i++) {
            	System.out.println(q9);
            	System.out.println("a. 6 ");
                System.out.println("b. 12 ");
                System.out.println("c. 34 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a9, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 10
            for(int i = 0; i < 1; i++) {
            	System.out.println(q10);
            	System.out.println("a. 87 ");
                System.out.println("b. 5 ");
                System.out.println("c. 43 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a10, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            
            
            
        }
        else {
        	System.out.println("Error");
        }
        
        
        System.out.println("Quiz Over");
        System.out.println(score);
        
        //first round of quiz is over 

        System.out.println("To play again press 1 and enter");
        //Begining of second quiz

        int response2 =start.nextInt();
        if(response2 == 1) {
        	
        	//question 8
            for(int i = 0; i < 1; i++) {
            	System.out.println(q8);
            	System.out.println("a. 4");
                System.out.println("b. 91");
                System.out.println("c. 45");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a8, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 5
            for(int i = 0; i < 1; i++) {
            	System.out.println(q5);
            	System.out.println("a. Hamster ");
                System.out.println("b. Rabbit ");
                System.out.println("c. Dog ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a5, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 1
            for(int i = 0; i < 1; i++) {
            	System.out.println(q1);
            	System.out.println("a. Dallas");
                System.out.println("b. Atlanta ");
                System.out.println("c. Hiram");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a1, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 6
            for(int i = 0; i < 1; i++) {
            	System.out.println(q6);
            	System.out.println("a. Ant");
                System.out.println("b. Computer ");
                System.out.println("c. Iphone ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a6, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 10
            for(int i = 0; i < 1; i++) {
            	System.out.println(q10);
            	System.out.println("a. 87 ");
                System.out.println("b. 5 ");
                System.out.println("c. 43 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a10, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 2
            for(int i = 0; i < 1; i++) {
            	System.out.println(q2);
            	System.out.println("a. 3");
                System.out.println("b. 6");
                System.out.println("c. 4");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a2, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 3
            for(int i = 0; i < 1; i++) {
            	System.out.println(q3);
            	System.out.println("a. Red ");
                System.out.println("b. Blue ");
                System.out.println("c. Yellow ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a3, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 9
            for(int i = 0; i < 1; i++) {
            	System.out.println(q9);
            	System.out.println("a. 6 ");
                System.out.println("b. 12 ");
                System.out.println("c. 34 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a9, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            
            //question 8
            for(int i = 0; i < 1; i++) {
            	System.out.println(q8);
            	System.out.println("a. 4 ");
                System.out.println("b. 91 ");
                System.out.println("c. 66 ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a8, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            //question 4
            for(int i = 0; i < 1; i++) {
            	System.out.println(q4);
            	System.out.println("a. Down ");
                System.out.println("b. Left ");
                System.out.println("c. Right ");
                String userAnswer = reader.nextLine();
                boolean check1  = grade(a4, userAnswer);
                if(check1) {
             	   score += 5;
            	   System.out.println("Correct!");
               }
               else {
            	   score -= 2;
            	   System.out.println("Incorrect");
               }    
            }
            
            
            
        }
        else {
        	System.out.println("Error");
        }
        System.out.println("Quiz Over");
        System.out.println(score);
        

        
            
            
            
            
            
         
    
    
    
    
    
    
    }

    public static boolean grade(String correctAnswer, String userAnswer){
    	if(userAnswer.equals(correctAnswer)) {
            return true;
    	}
    	else {
    		return false;
    	}
    }
    }