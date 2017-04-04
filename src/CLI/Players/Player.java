package CLI.Players;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class Player {

    /**
     * get player's ID
     *
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * set player's ID
     * may not be used
     *
     * @param ID String ID;
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * get player's score
     * Call this method when display scores
     *
     * @return double score
     */
    public double getScore() {
        return score;
    }

    /**
     * set player's score
     * Call this method when score is changed
     *
     * @param score double score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * some basic info of player
     */
    private String ID;
    private double score;

    /**
     * constructor of Player
     *
     * @param ID    String ID
     * @param score double score
     */
    public Player(String ID, double score) {
        this.ID = ID;
        this.score = score;
    }

    /**
     * This is the factor of getting Role of the Player
     * And the role will be display in the UI
     *
     * @param player player witch need to get
     * @return String the role of the player
     */
    public static String getRole(Player player) {
        String role = null;
        if (player instanceof Worker) {
            role = "Worker";
        }
        if (player instanceof Saboteur) {
            role = "Saboteur";
        }
        return role;
    }
}
