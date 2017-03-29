package CLI.Players;

import CLI.Cards.Card;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class Saboteur extends Player {

    /**
     * get the list of card which Saboteur player can have in hand
     * @return ArrayList<String></String> Scard
     */
    public ArrayList<String> getScard() {
        return Scard;
    }

    /**
     * set the list of card which Saboteur player can have in hand
     * may not be used....
     * @param scard ArrayList<String></String> Scard
     */
    public void setScard(ArrayList<String> scard) {
        Scard = scard;
    }

    /**
     * this is the card that Saboteur player can be own in hand
     */
    private ArrayList<String> Scard = new ArrayList<String>();

    /**
     * Constructor of Saboteur player
     * All param are super from superclass
     * @param id String id
     * @param score double score
     */
    public Saboteur(String id, double score) {
        super(id, score);
    }

    /**
     * Card number hold in player
     */
    private HashMap<Card,Integer> cardIntegerHashMap = new HashMap<Card, Integer>();

}
