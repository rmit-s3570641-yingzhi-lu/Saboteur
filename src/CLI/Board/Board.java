package CLI.Board;

import CLI.Cards.Card;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class Board {

    public Square[][] board = new Square[10][10];


    public void setBorad(){
        for(int y = 0;y<10;y++){
            for(int x = 0;x<10;x++){
               board[x][y]=new Square(x,y);
            }
        }
    }

}
