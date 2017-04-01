package CLI.Cards;


/**
 * Project Saboteur
 * Created by TonyZheng on 1/4/17.
 */
public class StartPoint extends Card {
    /**
     * this is Starting Point Class
     * this class is to prevent put card here
     * cause if put card method in square get null in card, the Card can be put in the square
     * this class may make the card return StartPoint
     */


    /**
     * introduction will display in the UI
     */
    private final static String introduction = "Start Point: ";

    /**
     * get The introduction of the card.
     *
     * @return String introduction
     */
    public static String getIntroduction() {
        return introduction;
    }

}
