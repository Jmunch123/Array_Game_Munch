/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munch_4_10x102d_array;

import static munch_4_10x102d_array.Munch_4_10x102D_Array.rand;

/**
 *
 * @author Jmunch123
 */
public class Enemy {
    public static int enemyx1 = rand.nextInt(20) + 1;
    public static int enemyy1 = rand.nextInt(20) + 1;
    public static int enemyx2 = rand.nextInt(20) + 1;
    public static int enemyy2 = rand.nextInt(20) + 1;
    public static int enemyx3 = rand.nextInt(20) + 1;
    public static int enemyy3 = rand.nextInt(20) + 1;
    
    public Enemy(int a, int b){
        this.enemyx1=a;
        this.enemyy1=b;
        
    }

    public static int getEnemyx1() {
        return enemyx1;
    }

    public static void setEnemyx1(int enemyx1) {
        Enemy.enemyx1 = enemyx1;
    }

    public static int getEnemyy1() {
        return enemyy1;
    }

    public static void setEnemyy1(int enemyy1) {
        Enemy.enemyy1 = enemyy1;
    }

    public static int getEnemyx2() {
        return enemyx2;
    }

    public static void setEnemyx2(int enemyx2) {
        Enemy.enemyx2 = enemyx2;
    }

    public static int getEnemyy2() {
        return enemyy2;
    }

    public static void setEnemyy2(int enemyy2) {
        Enemy.enemyy2 = enemyy2;
    }

    public static int getEnemyx3() {
        return enemyx3;
    }

    public static void setEnemyx3(int enemyx3) {
        Enemy.enemyx3 = enemyx3;
    }

    public static int getEnemyy3() {
        return enemyy3;
    }

    public static void setEnemyy3(int enemyy3) {
        Enemy.enemyy3 = enemyy3;
    }
    
}
