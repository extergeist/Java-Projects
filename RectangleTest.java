package jrproject6b;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to display a user menu, modify
the Rectangle class's initialized value of 1 with user input and display calculations 
based on the user data while error handling. */

//import scanner
import java.util.Scanner;

//main class
public class RectangleTest {

    /* this is the main method that begins and tests the rectangle class */
    public static void main(String[] args) {
        
        //creates a scanner to take user input
        Scanner input = new Scanner(System.in);
        //creates rectangle object with default values of 0
        Rectangle rectangle = new Rectangle();
        //variable named choice set at 0
        int choice = 0;
        
        do { //do while loop that starts and repeats as long as the choice is not equal to 3
            System.out.println("Rectangle Calculator"); //print title of menu
            System.out.println("1. Set length"); //print choice 1 
            System.out.println("2. Set width"); //print choice 2
            System.out.println("3. Exit"); //print choice 3
            System.out.print("Enter your choice: "); //ask user for input 
            
            try {
                //assigns user input to the choice variable 
                choice = input.nextInt();
                switch (choice) { //begin switch statement
                    //case block equal to choice 1
                    case 1:
                        System.out.print("Enter length: "); //asks user for length
                        double length = input.nextDouble(); //stores user input in variable called length
                        rectangle.setLength(length); //set length input in the rectangle object
                        System.out.println("Area = " + rectangle.getArea()); //prints calculated area
                        System.out.println("Perimeter = " + rectangle.getPerimeter()); //prints calculated perimeter
                        break;
                    //case block equal to choice 2 
                    case 2:
                        System.out.print("Enter width: "); //asks user for width
                        double width = input.nextDouble(); //stores user input in variable called double
                        rectangle.setWidth(width); //set width in the rectangle object
                        System.out.println("Area is " + rectangle.getArea()); //prints calculated area
                        System.out.println("Perimeter is " + rectangle.getPerimeter()); //prints calculated perimeter
                        System.out.println("Jordan Romano - Exercise 8.4 JHTP - CSIS 212(B01)"); //prints name and assignment and class number
                        break;
                    //case block equal to choice 3
                    case 3:
                        System.out.println("Bye!"); //print bye if choice 3 selected
                        break;
                    default:
                        System.out.println("Invalid!"); //prints if none of these cases are satisfied and the user types invalid input
                }
            } catch (IllegalArgumentException e) { //illegal argument exception if user continues to put invalid input
                System.out.println("Invalid input. Please try again.");
            }
            
        } while (choice != 3); //while the choice is not 3 keep looping
        
    }//end method
}//end class