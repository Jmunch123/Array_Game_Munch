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
public class Enemy2 {
    public static int enemy2x1 = rand.nextInt(20) + 1;
    public static int enemy2y1 = rand.nextInt(20) + 1;
    public static int enemy2x2 = rand.nextInt(20) + 1;
    public static int enemy2y2 = rand.nextInt(20) + 1;
    public static int enemy2x3 = rand.nextInt(20) + 1;
    public static int enemy2y3 = rand.nextInt(20) + 1;
    
    public Enemy2(int a, int b){
        this.enemy2x1=a;
        this.enemy2y1=b;
        
    }

    public static int getEnemy2x1() {
        return enemy2x1;
    }

    public static void setEnemy2x1(int enemy2x1) {
        Enemy2.enemy2x1 = enemy2x1;
    }

    public static int getEnemy2y1() {
        return enemy2y1;
    }

    public static void setEnemy2y1(int enemy2y1) {
        Enemy2.enemy2y1 = enemy2y1;
    }

    public static int getEnemy2x2() {
        return enemy2x2;
    }

    public static void setEnemy2x2(int enemy2x2) {
        Enemy2.enemy2x2 = enemy2x2;
    }

    public static int getEnemy2y2() {
        return enemy2y2;
    }

    public static void setEnemy2y2(int enemy2y2) {
        Enemy2.enemy2y2 = enemy2y2;
    }

    public static int getEnemy2x3() {
        return enemy2x3;
    }

    public static void setEnemy2x3(int enemy2x3) {
        Enemy2.enemy2x3 = enemy2x3;
    }

    public static int getEnemy2y3() {
        return enemy2y3;
    }

    public static void setEnemy2y3(int enemy2y3) {
        Enemy2.enemy2y3 = enemy2y3;
    }
}
