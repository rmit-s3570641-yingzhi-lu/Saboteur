package CLI.Cards;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 * Using Intellij IDEA
 */
public class RouteCard extends Card {
    private int[] route = new int[5];

    public boolean boom() {
        boolean state;
        if (route[5] == 0) {
            state = false;
        } else {
            route[5] = 0;
            state = true;
        }
        return state;
    }
}
