package CLI.Cards;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public abstract class ActionCard extends Card {

    /**
     * abstract method doAction()
     * Action cards must have doAction() method
     */
    public abstract void doAction();

    /**
     * the refactor of getting Introduction of the card
     *
     * @return String introduction
     */
    public static String getIntroduction() {
        String introduction = null;
        return introduction;
    }
}
