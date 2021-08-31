/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1910152_truongquangtuan_lab01.pkg2;

/**
 *
 * @author PC209
 */public class SnakeEyes {
public static void main(String[] args) {
int die1, die2; 
int countRolls; 
countRolls = 0;
do {
die1 = (int)(Math.random()*6) + 1;
die2 = (int)(Math.random()*6) + 1;
countRolls++; 
} while ( die1 != 1 || die2 != 1 );
System.out.println("It took " + countRolls + " rolls to get snake eyes.");
} 
 }
