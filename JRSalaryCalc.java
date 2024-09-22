package jrproject2;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to take salary pay input on 3 employees  
and return totals and adjusted totals if there was any overtime */
import java.util.Scanner; // this is a class Scanner

public class JRSalaryCalc { //the class name
    
    /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
        
   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);
  
   //this is the counter that counts up to 3 employees 
   int counter = 0;
   //as long as counter is 3 or less
        while (counter < 3) {
  
    //when the counter is at 0, it prints the following        
    if (counter == 0) {
        //print my name and the assignment name and class section info
        System.out.printf("Jordan Romano - Exercise 3.20 JHTP - CSIS 212(B01)%n");
               }
   
   System.out.print("Enter the hourly rate: "); // prompt
    double hourlyrate = input.nextDouble(); // creates variable and stores first number from user
   
   System.out.print("Enter the hours worked: "); // prompt
    int hours = input.nextInt(); // creates variable and stores second number from user
   
    // math formula for calculating gross income with overtime stored in a variable
   double totalpay = (hourlyrate * 40) + (hours - 40) * (1.50 * hourlyrate);
   
   if(hours <= 40) { //as long as the hours are below 40 it will print the pay variable's results
        double pay = hourlyrate * hours; //calculates regular pay
        System.out.printf("Pay for employee(%d) is $%.2f%n", ++counter, pay); 
        }
   else 
        //if the hours are over 40 it will return the totalpay variable which includes overtime
        System.out.printf("Pay for employee(%d) is $%.2f%n", ++counter, totalpay);
   
        }
    }
}
