package QuizApp;
import java.util.ArrayList;
import java.util.List;

public class GroupD {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)  throws InterruptedException{
        List questions = new ArrayList();

        questions.add(new Questions("Who was the first person to walk on the moon?",new String[] {"Neil Armstrong","Buzz Aldrin","Michael Collins","Yuri Gagarin"},1));
        questions.add(new Questions("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 3));
        questions.add(new Questions("Which planet is known as RedPlanet?",new String[] {"Mars","Venus","Jupiter","Saturn"},0));
        questions.add(new Questions("Who is the Prime minister of india?",new String[] {"Droupadi Murmu","Ramnath Kovind","Narendra Modi","ABJ Abdul Kalam"},2));
        questions.add(new Questions("Who is the Chief Minister of AP?",new String[] {"Chiranjeevi","Chandrababu Naidu","Jagan Mohan reddy","Pawan kalyan"},1));
        questions.add(new Questions("Who is the Deputy CM of Ap?", new String[] {"Nara Lokesh","Roja","Pawan kalyan","Jagan Mohan reddy"},2));
        questions.add(new Questions("Who wrote the play Romeo And Juliet?", new String[]{"William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"}, 3));
        questions.add(new Questions("What is the solution of this 2+2*2-2?",new String[] {"4","9","3","6"},0));
        questions.add(new Questions("Who painted the Mona Lisa?",new String[] {"Vincent van Gogh","Michelangelo","Leonardo da Vinci","Pablo Picasso"},2));
        questions.add(new Questions("When was IPL is introduced?",new String[] {"2005","2003","2008","2010"},2));

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}