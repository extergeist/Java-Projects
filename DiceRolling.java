package jrproject5;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to create a random die-rolling program 
that uses arrays and displays in a tabular format. */

import java.security.SecureRandom; //import SecureRandom

public class DiceRolling { //the public class name
    
    /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequencies = new int[11]; // initializes array to store frequencies with 11 elements
        
        for (int roll = 1; roll < 36000; roll++) { // for loop that rolls the dice 36,000 times
            int die1 = random.nextInt(6) + 1; // rolls first dice, a random integer from 1 to 6)
            int die2 = random.nextInt(6) + 1; // rolls second dice, a random integer from 1 to 6)
            int sum = die1 + die2; // variable to calculate sum of the two dice
            
            frequencies[sum - 2]++; // frequency count array for the sum which is sum minus 2
        }//end for loop
        
        // print name and assignment
        System.out.println("Jordan Romano - Exercise 6.17 JHTP - CSIS 212(B01) - 2/19/2023");
        
        // print and format the results in a tabular format
        System.out.format("%-10s%-10s%n", "Face", "Frequency");
        for (int roll = 1; roll < frequencies.length; roll++) {
            int face = roll + 2; // adds 2 to the index to get the sum value
            System.out.format("%-10d%-10d%n", face, frequencies[roll]); //print face and frequencies column headers
        }//end formatting
    }//end method
}//end class

    
