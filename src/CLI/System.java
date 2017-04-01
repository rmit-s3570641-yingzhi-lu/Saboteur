package CLI;

import CLI.Board.Board;
import CLI.Cards.GoldCard;
import CLI.Cards.StartPoint;

import java.util.Random;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class System {
    public static void main(String[] args) {

    }

    /**
     * This is a method that set gold card in to the board
     * Call this method when set Set gold location
     *
     * @param goldNum int Gold number
     */
    public void setGold(int goldNum) {
        Random random = new Random();
        int gold = 0;
        while (gold < goldNum) {
            int x = (random.nextInt() * 10);
            int y = (random.nextInt() * 10);
            int[] location = new int[2];
            location[0] = x;
            location[1] = y;
            if (Board.putCard(new GoldCard(), location)) {
                gold++;
            }
        }
    }

    /**
     * This method is set start method
     * Call this method before set Gold and others Card
     */
    public void setStrat() {
        Random random = new Random();
        int x = (random.nextInt() * 10);
        int y = (random.nextInt() * 10);
        int[] location = new int[2];
        location[0] = x;
        location[1] = y;
        Board.putCard(new StartPoint(), location);
    }

}
