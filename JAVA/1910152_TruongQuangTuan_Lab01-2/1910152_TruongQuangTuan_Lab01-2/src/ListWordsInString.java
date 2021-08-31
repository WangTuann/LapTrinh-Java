/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC209
 */
public class ListWordsInString {
public static void main(String[] args) {
String line;
int i; 
char ch; 
Boolean didCR;
System.out.println("Enter a line of text.");
System.out.print("? ");
line = TextIO.getln();
System.out.println();
didCR = true;
for ( i = 0; i < line.length(); i++ ) {
ch = line.charAt(i);
if ( Character.isLetter(ch) ) {
System.out.print(ch);
didCR = false;
}
else {
if ( didCR == false ) {
System.out.println();
didCR = true;
}
}
}
System.out.println(); 

        }
}
