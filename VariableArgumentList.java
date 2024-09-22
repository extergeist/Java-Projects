package jrproject5;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to calculate the product of a series of integers that are passed to a method named product 
using a variable-length argument list. */

public class VariableArgumentList{ //the public class name
    
    // method that takes a variable number of integer arguments using ellipsis
    public static int product(int... numbers) {
        int result = 1; // initializes the result variable to 1
        for (int number : numbers) { //for loop goes over every integer in the numbers array
            result *= number; //result variable multiplied by each integer
        }
        return result; //returns result
    }//end method
    
    // main string method 
    public static void main(String[] args) {
        // Test the product method with different number of arguments
        System.out.println("Product of 6 x 2 x 4: " + product(6, 2, 4)); //multiplies the numbers then prints
        System.out.println("Product of 5 x 6 x 7 x 8: " + product(5, 6, 7, 8)); //multiplies the numbers then prints
        System.out.println("Product of 20: " + product(20)); //simply returns 20
        //multiplies the numbers then prints operation and result
        System.out.println("Product of 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 x 10: " + 
                product(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // print name and assignment
        System.out.println("Jordan Romano - Exercise 6.14 JHTP - CSIS 212(B01) - 2/18/2023");
    }//end method
}//end class
