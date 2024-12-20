package QuizApp;

public class Player {
    String name;
    int score;
    int lifeLinesUsed;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.lifeLinesUsed = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }

    public boolean useLifeLine() {
        if (lifeLinesUsed < 2) {
            lifeLinesUsed++;
            return true;
        } else {
            return false;
        }
    }
}