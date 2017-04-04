package CLI;

import CLI.Board.Board;
import CLI.Cards.GoldCard;
import CLI.Cards.StartPoint;
import CLI.Players.Player;
import CLI.Players.Saboteur;
import CLI.Players.Worker;

import java.util.ArrayList;
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
    public static void setGold(int goldNum) {
        int gold = 0;
        while (gold < goldNum) {
            int x = (int)(Math.random()*10)+1;
            int y = (int)(Math.random()*10)+1;
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
        int x = (int)(Math.random()*10)+1;
        int y = (int)(Math.random()*10)+1;
        int[] location = new int[2];
        location[0] = x;
        location[1] = y;
        Board.putCard(new StartPoint(), location);
    }

    /**
     * This ArrayList Stores the information of Players
     */
    private static ArrayList<Player> players = new ArrayList<Player>();

    /**
     * This method decide how many players become Workers or Saboteurs
     *
     * @param playerNum int the total player number
     */
    public static void enterPlayers(int playerNum) {
        int s = 0;
        int w = 0;
        if (playerNum <= 1 || playerNum > 6) {

        } else if ((playerNum % 2) == 0) {
            s = playerNum / 2;
            w = playerNum / 2;
            generatePlayers(s, w);
        } else if ((playerNum % 2) != 0) {
            s = playerNum / 2;
            w = (playerNum / 2) + 1;
            generatePlayers(s, w);
        }
    }

    /**
     * this method is for generate players
     *
     * @param S numbers of Saboteurs
     * @param W numbers of Workers
     */
    private static void generatePlayers(int S, int W) {
        for (int i = 0; i < S; i++) {
            players.add(new Saboteur("Saboteur" + i + 1, 0));
        }
        for (int i = 0; i < W; i++) {
            players.add(new Worker("Worker" + i + 1, 0));
        }
    }

}
