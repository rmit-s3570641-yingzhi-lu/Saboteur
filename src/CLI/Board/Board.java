package CLI.Board;

import CLI.Cards.Card;
import CLI.Cards.StartPoint;

import java.util.Random;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class Board {

    /**
     * This is a basic board collection
     * 10*10 squares here
     */
    public static Square[][] board = new Square[10][10];

    /**
     * set every Square in Board as a empty Square
     * and set location using constructor
     */
    public void setBorad() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                board[x][y] = new Square(x, y);
            }
        }
    }

    /**
     * This is a sample put Card method
     * Call this method when put card on board
     *
     * @param card     Card (Route Card)
     * @param location int[x,y]
     * @return return true when success, false when already have card
     */
    public static boolean putCard(Card card, int[] location) {
        boolean state;
        Square square = board[location[0]][location[1]];
        if (square.getCard() == null) {
            square.setCard(card);
            state = true;
        } else {
            state = false;
        }
        return state;
    }



}
