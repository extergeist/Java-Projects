package jrproject4;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to build an application that will help an elementary school 
student learn multiplication. */

import java.util.Random; // this is the random object
import java.util.Scanner; // this is a class Scanner

public class CAI { //the class name

    // create random object as a class variable
    private static Random rand = new Random();
    //create a new scanner as a class variable
    private static Scanner input = new Scanner(System.in);
    
        // this is the main method
    public static void main(String[] args) {
        //variables for random numbers and the answer
        int number1;
        int number2;
        int answer;
        
        //generate the first two random numbers
        number1 = generateNumber();
        number2 = generateNumber();
        
        do {
            //asks the student a multiplication questions
            System.out.printf("How much is %d times %d? ", number1, number2);
            //store the answer that the student puts in
            answer = input.nextInt();
            
            //if number1 times number 2 equals answer"
            if (number1 * number2 == answer) {
                //if the student's answer matches the above then print "Very Good!
                System.out.println("Very Good!");
                //generate new random numbers
                number1 = generateNumber();
                number2 = generateNumber();
            } else {
                //if the answer is wrong print this
                System.out.println("No. Please try again.");
            }
        } while (true);
    }
    // generate 2 positive 1-digit integers
    private static int generateNumber() {
        return rand.nextInt(9) + 1;
        
    }//end method  
}//end class
