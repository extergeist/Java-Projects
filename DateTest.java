package jrproject6;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to execute and demonstrate the functionality of 
the Date class from the Date.java file. */

//main class
public class DateTest {
    
        /* this is the main method that begins and tests the date class */
    public static void main(String[] args) {
        //print my name and the assignment name and class section info
        System.out.printf("Jordan Romano - Exercise 7.13 JHTP - CSIS 212(B01)%n");
        //creates an instance of the date class 
        Date date = new Date(2, 25, 2023);
        //displays date
        date.displayDate();

    }//end method
}//end class
