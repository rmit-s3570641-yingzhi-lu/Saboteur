package CLI.Players;

import CLI.Cards.Card;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class Worker extends Player {

    /**
     * get the card that can own by Worker player
     * @return ArrayList<String></String> Wcard
     */
    public ArrayList<String> getWCard() {
        return WCard;
    }

    /**
     * set the card that can be owned by Worker player
     * @param WCard ArrayList<String></String> Wcard
     */
    public void setWCard(ArrayList<String> WCard) {
        this.WCard = WCard;
    }

    /**
     * the card collection that can be owned by Worker player
     */
    private ArrayList<String> WCard = new ArrayList<String>();

    /**
     * card hold in player (card type and number)
     */
    private HashMap<Card,Integer> cardIntegerHashMap = new HashMap<Card, Integer>();

    /**
     * Constructor of Worker Class
     * All param are super from superclass Player
     * @param ID String ID
     * @param score double score
     */
    public Worker(String ID, double score) {
        super(ID, score);
    }
}
