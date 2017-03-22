package CLI.Players;

import java.util.ArrayList;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 * Using Intellij IDEA
 */
public class Worker extends Player {
    public ArrayList<String> getWCard() {
        return WCard;
    }

    public void setWCard(ArrayList<String> WCard) {
        this.WCard = WCard;
    }

    ArrayList<String> WCard = new ArrayList<String>();

    public Worker(String ID, double score) {
        super(ID, score);
    }
}
