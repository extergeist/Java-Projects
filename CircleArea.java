package jrproject4;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to build an application that prompts the user for the radius of a circle 
and then calculates the area of the circle. */

import java.util.Scanner; // this imports a class Scanner

public class CircleArea { //the class name
    
    // this is the circleArea method for calculating the area of a circle
    public static double circleArea(double radius) {
        // Pi times radius times radius
        return Math.PI * radius * radius;
    }//close method
    
    // this is the main method
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // asks user for input
        System.out.print("Enter the radius of a circle: ");
        // stores the user's number in the variable named radius
        double radius = input.nextDouble();
        
         // Calculate the area using the circleArea method
        double area = circleArea(radius);
        //print the result
        System.out.printf("The area of that circle is %.2f", area);

           
    }//end method  
}//end class