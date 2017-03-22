package CLI.Players;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class Player {
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private String ID;
    private double score;

    public Player(String ID, double score) {
        this.ID = ID;
        this.score = score;
    }
}
