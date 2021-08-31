/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC209
 */
public class MostDivisor {
    public static void main(String[] args) {
        int N;
        int maxDivisors;
        int numWithMax;
        maxDivisors=1;
        numWithMax=1;
        for ( N = 2; N < 10000; N++) {
            int D;
            int divisorCount;
            divisorCount=0;
            for (D = 1;D <= N; D++) {
                if(N%D==0)
                    divisorCount++;
            }
            if (divisorCount>maxDivisors) {
                maxDivisors=divisorCount;
                numWithMax=N;           
            }         
        }
        System.out.println("Among integers between 1 and 10000,");
        System.out.println("The maximum number of divisor is " + maxDivisors);
        System.out.println("A number with " +maxDivisors+ "divisor is "+numWithMax);
    }
}
