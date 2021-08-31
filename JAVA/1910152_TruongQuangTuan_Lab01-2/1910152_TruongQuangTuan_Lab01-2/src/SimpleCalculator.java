/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC209
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        double firstNum ;
        double secondNum ;
        char operator ;
        double value;
        System.out.println("Enetr expressios such as 2+2 or 34.2 * 7.81");
        System.out.println("using any of the operators +,-,*,/");
        System.out.print("To end, enter a 0.");
        while (true) {  
            System.out.print("? ");
            firstNum = TextIO.getDouble();
            if (firstNum == 0)
            break;
            operator = TextIO.getChar();
            secondNum = TextIO.getlnDouble();
            switch(operator){
                case '+':
                    value = firstNum + secondNum;
                    break;
                case '-':
                    value = firstNum - secondNum;
                    break;
                case '*':
                    value = firstNum * secondNum;
                    break;
                 case '/':
                    value = firstNum / secondNum;   
                    break;
                    default:
                        System.out.print("unknow operator: "+operator);
                        continue;
           }
            System.out.println("value is "+value);
            System.out.println();
            
    }
       System.out.println("Good bye");
}
}
