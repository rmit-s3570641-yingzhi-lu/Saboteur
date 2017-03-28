package CLI.Board;

import CLI.Cards.Card;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class Square {
    private int[] location = new int[2];

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    private Card card = null;

    public Square(int x, int y) {
        location = new int[]{y, x};
    }

}
