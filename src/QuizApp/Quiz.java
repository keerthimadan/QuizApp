package QuizApp;

import java.util.List;
import java.util.Scanner;

public class Quiz
{
	List<Questions> questions;
    Player player;
    Scanner sc=new Scanner(System.in);

    public Quiz(List<Questions> questions) {
        this.questions = questions;
        this.sc = new Scanner(System.in);
    }

    public void start() throws InterruptedException 
    {
    	System.out.println("Welcome participate");
    	String email=sc.next();
    	System.out.println("Email Id: "+email);
    	String password=sc.next();
    	System.out.println("Password: "+password);
    	int num=sc.nextInt();
    	System.out.println("Phone Number: "+num);
    	System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        player = new Player(name);
        System.out.println("Rules:");
        System.out.println("No Cheating");
        System.out.println("Time Limits");
        System.out.println("Contesting Answers no wrong answers if wrong answers are provided by the participate he will be eliminated");
        System.out.println("No negative points");
        System.out.println("If no answer is known quit the game");
        System.out.println("You have 2 lifelines.");
        System.out.println("1. 50/50");
        System.out.println("2. Audience poll");
        System.out.println("Incorrect answers will terminate the game.");
        
   

        for (Questions questions : questions) {
            System.out.println( questions.getQuestion());
            for (int i = 0; i < questions.getOptions().length; i++) {
                System.out.println((i + 1) + ". " +questions.getOptions()[i]);
            }

            if (player.useLifeLine()) {
                System.out.println("Choose an answer:");
                
            } 
         

            int answer = sc.nextInt();

  
            if (questions.isCorrectAnswer(answer)) {
            	player.addScore(10);
   
                System.out.println("Correct!");
            } 
           
            else {
                System.out.println("Incorrect!");
                System.out.println("Game Over!");
                System.out.println("Your score: " + player.getScore());
                return;
            }
        }

        System.out.println("Congratulations, " + player.getName() + "!");
        System.out.println("You have completed the quiz!");
        System.out.println("Your final score: " + player.getScore());
}
}