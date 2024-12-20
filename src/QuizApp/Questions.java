package QuizApp;
	public class Questions extends GroupD{
	    String questions;
	    String[] options;
	    int correctAnswerIndex;

	    public Questions(String questions, String[] options, int correctAnswerIndex) {
	        this.questions = questions;
	        this.options = options;
	        this.correctAnswerIndex = correctAnswerIndex;
	    }

	    public String getQuestion() {
	        return questions;
	    }

	    public String[] getOptions() {
	        return options;
	    }

	    public boolean isCorrectAnswer(int answerIndex) {
	        return answerIndex == correctAnswerIndex;
	    }
	}

