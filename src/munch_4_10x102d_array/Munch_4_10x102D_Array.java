package munch_4_10x102d_array;

import java.util.Random;
import java.util.Scanner;

public class Munch_4_10x102D_Array {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static String move;
    public static String choice;
    public static final Random rand = new Random();
    public static int treasurey = rand.nextInt(28) + 1;
    public static int treasurex = rand.nextInt(28) + 1;
    public static int treasurey2 = rand.nextInt(28) + 1;
    public static int treasurex2 = rand.nextInt(28) + 1;
    public static int treasurey3 = rand.nextInt(28) + 1;
    public static int treasurex3 = rand.nextInt(28) + 1;
    public static int wallx = rand.nextInt(28) + 1;
    public static int wally = rand.nextInt(28) + 1;
    public static int wallx2 = rand.nextInt(28) + 1;
    public static int wally2 = rand.nextInt(28) + 1;
    public static int wallx5 = rand.nextInt(28) + 1;
    public static int wally5 = rand.nextInt(28) + 1;
    public static int wallx3 = rand.nextInt(28) + 1;
    public static int wally3 = rand.nextInt(28) + 1;
    public static int wallx4 = rand.nextInt(28) + 1;
    public static int wally4 = rand.nextInt(28) + 1;
    
    
    
    public static Player player;
    
    public static Traps traps;
    
    public static Traps2 traps2;
    
    public static Enemy enemy;
    
    public static Enemy2 enemy2;
    
    
    public static void main(String[] args) {
        start();
    }
    static void start(){
        System.out.println(ANSI_YELLOW +"Right now you are traped in the Abyss and the only way out is to gain 3 holy treasures \n"
                + "Good luck..., and start with T and make your way to t and B");
        player = new Player(12,12);
        traps = new Traps(traps.trapx1, traps.trapy1);
        enemy = new Enemy(enemy.enemyx1, enemy.enemyy1);
        enemy2 = new Enemy2(enemy2.enemy2x1, enemy2.enemy2y1);
        traps2 = new Traps2(traps2.trap2x, traps2.trap2y);
        ImputX();
        ImputY();
        Map();
        walls();
        movement();
    }
    

    static void Map() {
        char[][] map = new char[30][30];

        //map[player.imputX-1][player.imputY-1] = 'x';
        map[player.imputY - 1][player.imputX - 1] = '@';
        map[traps.trapx1 - 1][traps.trapy1 - 1] = '*';
        map[traps.trapx2 - 1][traps.trapy2 - 1] = '*';
        map[traps.trapx3 - 1][traps.trapy3 - 1] = '*';
        map[traps.trapx4 - 1][traps.trapy4 - 1] = '*';
        map[traps.trapx5 - 1][traps.trapy5 - 1] = '*';
        map[traps.trapx6 - 1][traps.trapy6 - 1] = '*';
        map[traps.trapx7 - 1][traps.trapy7 - 1] = '*';
        map[traps.trapx8 - 1][traps.trapy8 - 1] = '*';
        map[traps.trapx9 - 1][traps.trapy9 - 1] = '*';
        map[traps.trapx10 - 1][traps.trapy10 - 1] = '*';
        map[traps.trapx11 - 1][traps.trapy11 - 1] = '*';
        map[traps.trapx12 - 1][traps.trapy12 - 1] = '*';
        map[traps.trapx13 - 1][traps.trapy13 - 1] = '*';
        map[traps.trapx14 - 1][traps.trapy14 - 1] = '*';
        map[traps.trapx15 - 1][traps.trapy15 - 1] = '*';
        map[traps.trapx16 - 1][traps.trapy16 - 1] = '*';
        
        enemy();
        map[enemy.enemyx1 - 1][enemy.enemyy1 - 1] = 'H';
        enemy2();
        map[enemy.enemyx2 - 1][enemy.enemyy2 - 1] = 'H';
        enemy3();
        map[enemy.enemyx3 - 1][enemy.enemyy3 - 1] = 'H';
        Enemy1();
        map[enemy2.enemy2x1][enemy2.enemy2y1] = 'h';
        Enemy2();
        map[enemy2.enemy2x2][enemy2.enemy2y2] = 'h';
        Enemy3();
        map[enemy2.enemy2x3][enemy2.enemy2y3] = 'h';
        
        //map[enemy.enemyx4 - 1][enemy.enemyy4 - 1] = 'E';
        map[treasurey - 1][treasurex - 1] = 'T';
        map[treasurey2 - 1][treasurex2 - 1] = 't';
        map[treasurey3 - 1][treasurex3 - 1] = 'B';
        
        map[wallx][wally] = '|';
        map[wallx2][wally2] = '|';
        map[wallx3][wally3] = '|';
        map[wallx4][wally4] = '|';
        map[wallx5][wally5] = '|';
        
        map[traps2.trap2x - 1][traps2.trap2y - 1] = '.';
        map[traps2.trap2x1 - 1][traps2.trap2y1 - 1] = '.';

        for (int i = 0; i <= map[0].length - 1; i++) {
            for (int j = 0; j <= map[1].length - 1; j++) {
                if (j < map[1].length - 1) {
                    if (i == 0) {

                        System.out.print(ANSI_RED +"▬▬▬");
                    } else if (i == 29) {

                        System.out.print(ANSI_RED +"▬▬▬");
                    } else if (j == 0) {
                        System.out.print(ANSI_PURPLE +"▐");
                    } else if (j == 29) {
                        System.out.print(ANSI_PURPLE + "▐");
                    } else if (map[i][j] != '@' && map[i][j] != '.' && map[i][j] != '*' &&   map[i][j] != 'H' && map[i][j] != 'T' && map[i][j] != 't' && map[i][j] != 'B' && map[i][j] != 'h' && map[i][j] != '|'  ) { //map[i][j] != 'x' 
                        System.out.print(ANSI_PURPLE + " . ");
                    } else {
                        System.out.print(ANSI_CYAN +" " + map[i][j] + ANSI_CYAN + " ");
                    }
                } else {
                    if (i == 0) {

                        System.out.println("");
                    } else if (i == 29) {
                        System.out.println("");
                    } else if (j == 0) {
                        System.out.println("▐");
                    } else if (j == 29) {
                        System.out.println("▐");
                    } else if (map[i][j] !='@' && map[i][j] != '*' && map[i][j] != 'H' && map[i][j] != 'T' && map[i][j] != 'h' && map[i][j] != '.') { //map[i][j] != 'x'
                        System.out.println(" . ");
                    } else {
                        System.out.println(" " + map[i][j] + " ");
                    }
                }
            }
        }

        /*for (int i = 0; i <= map[0].length - 1; i++) {
            for (int j = 0; j <= map[1].length - 1; j++) {
                if (j < map[1].length - 1) {
                    if (map[i][j] != '@' && map[i][j] != '*' && map[i][j] != 'T' && map[i][j] != 'H' && map[i][j] != 'h'&& map[i][j] != '|') {
                        System.out.print(".");
                    } else {
                        System.out.print(map[i][j]);
                    }
                } else {
                    if (map[i][j] != '@' && map[i][j] != '*' && map[i][j] != 'T' && map[i][j] != 'H' && map[i][j] != 'h'&& map[i][j] != '|') {
                        System.out.println(".");
                    } else {
                        System.out.println(map[i][j]);
                    }
                }
            }
        }*/movement();
    }

    static void ImputX() {
        Scanner ImputX = new Scanner(System.in);
        System.out.println("X: Choose between 1-30");
        player.imputX = ImputX.nextInt();
        if (player.imputX < 1 || player.imputX > 30) {
            System.out.println("Choose a Number between 1-30");
            ImputX();
        }
    }

    static void ImputY() {
        Scanner ImputY = new Scanner(System.in);
        System.out.println("Y: Choose between 1-30");
        player.imputY = ImputY.nextInt();
        if (player.imputY < 1 || player.imputY > 30) {
            System.out.println("Choose a Number between 1-30");
            ImputY();
        }
    }

    static void movement() { 
        System.out.println("Hero Coordinates :" + player.imputX + "," + player.imputY);
        System.out.println("Enemy Coordinates :" + enemy.enemyx1 + "," + enemy.enemyy1 + ";" + enemy.enemyx2 + "," + enemy.enemyy2 + ";" + enemy.enemyx3 + "," + enemy.enemyy3 + ";" + enemy2.enemy2x1 + "," + enemy2.enemy2y1 + ";" + enemy2.enemy2x2 + "," + enemy2.enemy2y2 + ";" + enemy2.enemy2x3 + "," + enemy2.enemy2y3);
        Scanner Move = new Scanner(System.in);
        if (player.imputY == traps.trapx1 && player.imputX == traps.trapy1 || player.imputY == traps.trapx2 && player.imputX == traps.trapy2 || player.imputY == traps.trapx3 && player.imputX == traps.trapy3 || player.imputY == traps.trapx4 && player.imputX == traps.trapy4 
       || player.imputY == traps.trapx5 && player.imputX == traps.trapy5  || player.imputY == traps.trapx6 && player.imputX == traps.trapy6  || player.imputY == traps.trapx7 && player.imputX == traps.trapy7  || player.imputY == traps.trapx8 && player.imputX == traps.trapy8 || 
       player.imputY == traps.trapx9 && player.imputX == traps.trapy9 || player.imputY == traps.trapx10 && player.imputX == traps.trapy10 || player.imputY == traps.trapx11 && player.imputX == traps.trapy11 || player.imputY == traps.trapx12 && player.imputX == traps.trapy12 || 
       player.imputY == traps.trapx13 && player.imputX == traps.trapy13  || player.imputY == traps.trapx14 && player.imputX == traps.trapy14  || player.imputY == traps.trapx15 && player.imputX == traps.trapy15  || player.imputY == traps.trapx16 && player.imputX == traps.trapy16) {    
       player.health = 0;
       if(player.health == 0){
            System.out.println( ANSI_YELLOW +
"##    ##  #######  ##     ##  ##        #######   ######  ######## \n" +
" ##  ##  ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" +
"  ####   ##     ## ##     ##  ##       ##     ## ##       ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ##  ######  ######   \n" +
"   ##    ##     ## ##     ##  ##       ##     ##       ## ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" + ANSI_YELLOW +
"   ##     #######   #######   ########  #######   ######  ######## ");
            lose();
        }
       if(player.imputY == traps2.trap2x && player.imputX == traps2.trap2y){
           System.out.println( ANSI_YELLOW +
"##    ##  #######  ##     ##  ##        #######   ######  ######## \n" +
" ##  ##  ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" +
"  ####   ##     ## ##     ##  ##       ##     ## ##       ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ##  ######  ######   \n" +
"   ##    ##     ## ##     ##  ##       ##     ##       ## ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" + ANSI_YELLOW +
"   ##     #######   #######   ########  #######   ######  ######## ");
            lose();
       }
        }
        if (player.imputX == treasurex && player.imputY == treasurey){
            System.out.println(ANSI_YELLOW + "Hurry, the Abyss is closing in on you.");
            player.points++;
            treasurex = 1;
            treasurey = 1;
        }
        if (player.imputX == treasurex2 && player.imputY == treasurey2 ){
            System.out.println(ANSI_YELLOW + "Your almost out, just one more.");
            player.points++;
            
            treasurex2 = 1;
            treasurey2 = 1;
         } 
        if (player.imputX == treasurex3 && player.imputY == treasurey3 ){
            System.out.println(ANSI_YELLOW +"You've done it, you escaped");
            player.points++;
            treasurex3 = 1;
            treasurey3 = 1;
        } 
        
        if (player.points == 3){
            System.out.println( ANSI_YELLOW +
"##    ##  #######  ##     ##  ##      ## #### ##    ## \n" +
" ##  ##  ##     ## ##     ##  ##  ##  ##  ##  ###   ## \n" +
"  ####   ##     ## ##     ##  ##  ##  ##  ##  ####  ## \n" +
"   ##    ##     ## ##     ##  ##  ##  ##  ##  ## ## ## \n" +
"   ##    ##     ## ##     ##  ##  ##  ##  ##  ##  #### \n" +
"   ##    ##     ## ##     ##  ##  ##  ##  ##  ##   ### \n" + ANSI_YELLOW +
"   ##     #######   #######    ###  ###  #### ##    ## ");
            win();
        }
        if (player.imputY == enemy.enemyx1 && player.imputX == enemy.enemyy1 || player.imputY == enemy.enemyx2 && player.imputX == enemy.enemyy2 || player.imputY == enemy.enemyx3 && player.imputX == enemy.enemyy3 || player.imputY == enemy2.enemy2x2 && player.imputX == enemy2.enemy2y2 || player.imputY == enemy2.enemy2x3 && player.imputX == enemy2.enemy2y3 || player.imputY == enemy2.enemy2x1 && player.imputX == enemy2.enemy2y1){
             player.health--;
       if(player.health == 0){
            
            System.out.println( ANSI_YELLOW +
"##    ##  #######  ##     ##  ##        #######   ######  ######## \n" +
" ##  ##  ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" +
"  ####   ##     ## ##     ##  ##       ##     ## ##       ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ##  ######  ######   \n" +
"   ##    ##     ## ##     ##  ##       ##     ##       ## ##       \n" +
"   ##    ##     ## ##     ##  ##       ##     ## ##    ## ##       \n" + ANSI_YELLOW +
"   ##     #######   #######   ########  #######   ######  ######## ");
            lose();
        }
        }
        
        //if (player.imputX == enemy.enemyx1 && player.imputY == enemy.enemyy1 || player.imputX == enemy.enemyx2 && player.imputY == enemy.enemyy2 || player.imputX == enemy.enemyx3 && player.imputY == enemy.enemyy3 || player.imputX == enemy.enemyx4 && player.imputY == enemy.enemyy4 ){
        //}
        System.out.println("Health:" + player.health);
        System.out.println("Score:" + player.points);
        System.out.println("Do you want to go north(N), south(S), east(E), west(W)\n northeast(NE), southeast(SE), northwest(NW), or southwest(SW)");
        System.out.println("You could double or even triple your movement around the map if you type either a 2 or no number infront \n of the direction you would wish to go, if you wish only to move one space than type 1 infront of the direction you would like to go");
        move = Move.nextLine().toLowerCase();
        if (move.contains("N") && move.contains("E") || move.contains("n") && move.contains("e")) {
             if(move.contains("1") && move.contains("n")  && move.contains("e")) {
                player.imputY--;
                player.imputX++;
            }
            else if(move.contains("2")  && move.contains("n")  && move.contains("e")) {
                player.imputY--;
                player.imputX++;
                player.imputY--;
                player.imputX++;
              
            }
            else if(move.contains("n") && move.contains("e")) {
                player.imputY--;
                player.imputY--;
                player.imputY--;
                player.imputX++;
                player.imputX++;
                player.imputX++;
            }
            Map();
        } else if (move.contains("S") && move.contains("E") || move.contains("s") && move.contains("e")) {
             if(move.contains("1") && move.contains("s")  && move.contains("e")) {
                player.imputY++;
                player.imputX++;
            }
            else if(move.contains("2")  && move.contains("s")  && move.contains("e")) {
                player.imputY++;
                player.imputX++;
                player.imputY++;
                player.imputX++;
              
            }
            else if(move.contains("s") && move.contains("e")) {
                player.imputY++;
                player.imputY++;
                player.imputY++;
                player.imputX++;
                player.imputX++;
                player.imputX++;
            }
            Map();
        } else if (move.contains("N") && move.contains("W") || move.contains("n") && move.contains("w")) {
             if(move.contains("1") && move.contains("n")  && move.contains("w")) {
                player.imputY--;
                player.imputX--;
            }
            else if(move.contains("2")  && move.contains("n")  && move.contains("w")) {
                player.imputY--;
                player.imputX--;
                player.imputY--;
                player.imputX--;
              
            }
            else if(move.contains("n") && move.contains("w")) {
                player.imputY--;
                player.imputY--;
                player.imputY--;
                player.imputX--;
                player.imputX--;
                player.imputX--;
            }
            Map();
        } else if (move.contains("S") && move.contains("W") || move.contains("s") && move.contains("w")) {
            if(move.contains("1") && move.contains("s")  && move.contains("w")) {
                player.imputY++;
                player.imputX--;
            }
            else if(move.contains("2")  && move.contains("s")  && move.contains("w")) {
                player.imputY++;
                player.imputX--;
                player.imputY++;
                player.imputX--;
              
            }
            else if(move.contains("s") && move.contains("w")) {
                player.imputY++;
                player.imputY++;
                player.imputY++;
                player.imputX--;
                player.imputX--;
                player.imputX--;
            }
            Map();
        } else if (move.contains("N") || move.contains("n")) {
            
            if(move.contains("1") && move.contains("n")) {
                player.imputY--;
            }
            else if(move.contains("2") && move.contains("n")) {
                player.imputY--;
                player.imputY--;
            }
            else if(move.contains("n")) {
                player.imputY--;
                player.imputY--;
                player.imputY--;
            }
            Map();
        } else if (move.contains("S") || move.contains("s")) {
             if(move.contains("1") && move.contains("s")) {
                player.imputY++;
            }
            else if(move.contains("2") && move.contains("s")) {
                player.imputY++;
                player.imputY++;
            }
            else if(move.contains("s")) {
                player.imputY++;
                player.imputY++;
                player.imputY++;
            }
            Map();
        } else if (move.contains("E") || move.contains("e")) {
             if(move.contains("1") && move.contains("e")) {
                player.imputX++;
            }
            else if(move.contains("2") && move.contains("e")) {
                player.imputX++;
                player.imputX++;
            }
            else if(move.contains("e")) {
                player.imputX++;
                player.imputX++;
                player.imputX++;
            }
            Map();
        } else if (move.contains("W") || move.contains("w")) {
             if(move.contains("1") && move.contains("w")) {
                player.imputX--;
            }
            else if(move.contains("2") && move.contains("w")) {
                player.imputX--;
                player.imputX--;
            }
            else if(move.contains("w")) {
                player.imputX--;
                player.imputX--;
                player.imputX--;
            }
            Map();
        }
        
        
    }
    static void lose(){
         System.out.println(ANSI_YELLOW + "You have been consumed by the madness that the abyss has casted on to you");
        System.out.println("Do you want to try again?");
        Scanner Choice = new Scanner(System.in);
        choice = Choice.nextLine();
        if(choice.contains("No") || choice.contains("no")){
            System.exit(0);
        }else if(choice.contains("Yes") || choice.contains("yes")){
            start();
        }
    }
    static void win(){
         System.out.println(ANSI_YELLOW +"You have made it out alive, but there are more treasures down in the abyss, will you dare dive in again?");
        System.out.println("Do you want to try again?");
        Scanner Choice = new Scanner(System.in);
        choice = Choice.nextLine();
        if(choice.contains("No") || choice.contains("no")){
            System.exit(0);
        }else if(choice.contains("Yes") || choice.contains("yes")){
            start();
        }
    }
    
    static void enemy(){
        if(player.imputY > enemy.enemyx1){
            enemy.enemyx1++;
            
        }else if(player.imputX > enemy.enemyy1){ 
            enemy.enemyy1++;
            
        }else if(player.imputY < enemy.enemyx1){  
            enemy.enemyx1--;
       
        }else if(player.imputX < enemy.enemyy1){
            enemy.enemyy1--;
        
        } 
       
    }
    static void Enemy1(){
         if(player.imputY > enemy2.enemy2x1){
            enemy2.enemy2x1++;
            enemy2.enemy2x1++;
            
        }
        if(player.imputX > enemy2.enemy2y1){
            enemy2.enemy2y1++;
            enemy2.enemy2y1++;
            
        }
        if(player.imputY < enemy2.enemy2x1){
            enemy2.enemy2x1--;
            enemy2.enemy2x1--;
            
        }
        if(player.imputX < enemy2.enemy2y1){
            enemy2.enemy2y1--;
            enemy2.enemy2y1--;
            
        }
    }
    static void enemy2(){
        if(player.imputY > enemy.enemyx2){ 
            enemy.enemyx2++;
            
        }else if(player.imputX > enemy.enemyy2){
            enemy.enemyy2++;
            
        }else if(player.imputY < enemy.enemyx2){  
            enemy.enemyx2--;
            
        }else if(player.imputX < enemy.enemyy2){ 
            enemy.enemyy2 --;
            
        }
       
    }
    
    static void Enemy2(){
         if(player.imputY > enemy2.enemy2x2){
             enemy2.enemy2x2++;
             enemy2.enemy2x2++;
            
        }
        if(player.imputX > enemy2.enemy2y2){
             enemy2.enemy2y2++;
             enemy2.enemy2y2++;
            
        }
        if(player.imputY < enemy2.enemy2x2){
             enemy2.enemy2x2--;
             enemy2.enemy2x2--;
            
        }
        if(player.imputX < enemy2.enemy2y2){
             enemy2.enemy2y2--;
             enemy2.enemy2y2--;
            
        }
    }
    static void enemy3(){
        if(player.imputY > enemy.enemyx3){ 
            enemy.enemyx3++;
            
        }else if(player.imputX > enemy.enemyy3){
            enemy.enemyy3++;
            
        }else if(player.imputY < enemy.enemyx3){  
            enemy.enemyx3--;
            
        }else if(player.imputX < enemy.enemyy3){ 
            enemy.enemyy3 --;
            
        }
       
   
    }
    static void Enemy3(){
     if(player.imputY > enemy2.enemy2x3){
            enemy2.enemy2x3++;
            enemy2.enemy2x3++;
            
        } 
        if(player.imputX > enemy2.enemy2y3){
             enemy2.enemy2y3++;
             enemy2.enemy2y3++;
            
        }
        if(player.imputY < enemy2.enemy2x3){
             enemy2.enemy2x3--;
             enemy2.enemy2x3--;
            
        }
        if(player.imputX < enemy2.enemy2y3){
             enemy2.enemy2y3--;
             enemy2.enemy2y3--;
            
        }
    }
    static void walls(){
        if(player.imputX == wallx){
            player.imputX--;
        }
        if(player.imputY == wally){
            player.imputY--;
        }
        if(enemy.enemyx1 == wallx){
            enemy.enemyx1--;
            
        if(enemy.enemyy1 == wally){
            enemy.enemyy1--;
            
        }
        }
    }
}
    

