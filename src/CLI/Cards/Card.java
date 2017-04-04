package CLI.Cards;

/**
 * Project Saboteur
 * Created by TonyZheng on 11/3/17.
 */
public class Card {

    /**
     * This method is to get Introduction from every Cards
     * String of the introduction will display in the introduction Field in UI
     *
     * @param card Card will be get
     * @return String the introduction of the Card
     */
    public static String displayIntroduction(Card card) {
        String introduction = null;
        if (card instanceof GoldCard) {
            introduction = GoldCard.getIntroduction();
        }
        if (card instanceof RouteCard) {
            introduction = RouteCard.getIntroduction();
        }
        if (card instanceof ActionCard) {
            introduction = ActionCard.getIntroduction();
        }
        if (card instanceof StartPoint) {
            introduction = StartPoint.getIntroduction();
        }
        return introduction;
    }
}
