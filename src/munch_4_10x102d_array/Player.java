
package munch_4_10x102d_array;

public class Player {
    public static int imputX;
    public static int imputY;
    public static int health = 10;
    public static int points;
    
    public Player(int a, int b){
        this.imputX=a;
        this.imputY=b;
    }

    public static int getImputX() {
        return imputX;
    }

    public static void setImputX(int imputX) {
        Player.imputX = imputX;
    }

    public static int getImputY() {
        return imputY;
    }

    public static void setImputY(int imputY) {
        Player.imputY = imputY;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Player.health = health;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        Player.points = points;
    }
}    