package CLI.Players;

import java.util.ArrayList;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class Saboteur extends Player {
    public ArrayList<String> getScard() {
        return Scard;
    }

    public void setScard(ArrayList<String> scard) {
        Scard = scard;
    }

    private ArrayList<String> Scard = new ArrayList<String>();

    public Saboteur(String id, double score) {
        super(id, score);
    }

}
