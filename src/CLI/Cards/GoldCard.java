package CLI.Cards;

/**
 * Project Saboteur
 * Created by TonyZheng on 29/3/17.
 */
public class GoldCard extends Card {
    /**
     * This is Gold Card Class
     */

    private final static String introduction = "Gold: Worker: Collect Gold to earn Score,\n" +
            "Saboteur: Prevent Workers to Collect Gold";


    /**
     * Getter of String introduction.
     * the String will displayed in the Introduction Field in the GUI
     *
     * @return String introduction.
     */
    public static String getIntroduction() {
        return introduction;
    }
}

