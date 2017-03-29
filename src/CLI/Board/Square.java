package CLI.Board;

import CLI.Cards.Card;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class Square {

    /**
     * using Array to store location of the Square
     */
    private int[] location = new int[2];

    /**
     * get location
     * @return Array (location)
     */
    public int[] getLocation() {
        return location;
    }

    /**
     * set location
     * maybe never used
     * @param location Array int[y,x]
     */
    public void setLocation(int[] location) {
        this.location = location;
    }

    /**
     * get card info of the Square
     * @return Card (card info)
     */
    public Card getCard() {
        return card;
    }

    /**
     * set Card into Square
     * call this method when player put card into Square
     * @param card Card info
     */
    public void setCard(Card card) {
        this.card = card;
    }

    /**
     * When construct Square using constructor the card is Null
     */
    private Card card = null;

    /**
     * Constructor of Square
     * @param x location X
     * @param y location Y
     */
    public Square(int x, int y) {
        location = new int[]{y, x};
    }

}
