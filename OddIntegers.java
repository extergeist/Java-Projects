package jrproject3;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to build an application that calculates 
the product of the odd integers from 1 to 15. */
public class OddIntegers { //the class name

    /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
    
    //variable named total is equal to 1
    int total = 1;
    
    //for loop that multiplies all odd integers between 1 and 15
    for (int number = 1; number <= 15; number += 2)
        total *= number;

                
     //print The product of odd numbers 1 - 15 is: total
    System.out.printf("The product of odd integers from 1 - 15 is: %d%n",total); 
    // print name and assignment
    System.out.println("Jordan Romano - Exercise 4.12 - CSIS 212(B01) - 2/4/2023");
               
    
                
    }//end method  
}//end class
