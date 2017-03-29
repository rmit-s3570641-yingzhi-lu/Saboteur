package CLI.Cards;

/**
 * Project Saboteur
 * Created by TonyZheng on 15/3/17.
 */
public class RouteCard extends Card {

    /*
     * l=left
     * r=right
     * t=top
     * b=bottom
     * m=cross
     * 0=not access
     * 1=access
     */
    public RouteCard(int l,int r,int t,int b,int m){
        route[0]=l;
        route[1]=r;
        route[2]=t;
        route[3]=b;
        route[4]=m;
    }

    /*
     * every Route card have a route set
     * using int[] here to store data
     */
    private int[] route = new int[5];

    /*
     * this is a location set method
     * 0=left hand side
     * 1=right hand side
     * 2=top
     * 3=bottom
     * 4=cross
     * if = 1 means can be access
     * if = 0 means can not access
     */
    public void setRouteCard(int location,int accessable){
        route[location]=accessable;
    }

    /*
     * I want to add compare method here
     * card1 card2    card put location
     */
    public boolean compareRoute(){
        return true;
    }

    /*
     * this is demo action card
     * set the card cannot access from cross
     */
    public boolean boom() {
        boolean state;
        if (route[4] == 0) {
            state = false;
        } else {
            route[4] = 0;
            state = true;
        }
        return state;
    }
}
