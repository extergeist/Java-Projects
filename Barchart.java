package jrproject3;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to chart 5 numbers between 1 and 30 in the form of asterisks */

import java.util.Scanner; // this imports a class Scanner
public class Barchart { //class name
    
        /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
    

    // create a Scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);
    
    //print name, date and assignment
    System.out.println("Jordan Romano - Exercise 4.16 JHTP - CSIS 212(B01) - 2/4/2023");
    //asks for user input, a number between 1 and 30
    System.out.printf("Enter five numbers between 1 and 30: %n");
   
    /*Unfortunately, I could not get my case and switch statement to work, so I used an array 
    to store the 5 numbers that the user inputs to finish this project. 
    New int here is used to define that the array can hold those 5 numbers in memory*/
    int array[]= new int[5];
    
    //for loop stating that the counter that takes in 5 number inputs from a user
    for (int counter = 0; counter < 5; counter++)
    {//end for loop
    

        
    //the array stores values according to the counter's 5 user inputs
    array[counter] = input.nextInt();
    
    
    }
    //for loop that states the counter is defined as 0 and it must be less than 5
    for (int counter = 0; counter <= 5; counter++)
    {
    //for loop the asterisk counter is 0 by default and 
    for (int stars = 0; stars < array[counter]; stars++)
    //print asterisk to chart the number that the user puts in
    System.out.print("*");
    
        System.out.println();
    }//end for loop
    
    }//end method  
}//end class
