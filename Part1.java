package jrfinalproject;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to return student ID information 
based on the relevant student ID number that the user enters in the dialog box. 
If the user enters a student ID number not known to the program it will display an error message*/


//imports dialog box class from javax.swing package
import javax.swing.JOptionPane;

//the class name
public class Part1 {
    
    public static void main(String[] args){
        // declare and initialize 10 arrays to store 10 student ID numbers provided below
        int[] studentIDs = { 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009 };
        String[] firstNames = { "Max", "Jordan", "Cinthya", "Emily", "Andrew", "Alex", "Charles", "Josh", "Natalie", "Wanda" };
        double[] gpas = { 3.20, 3.75, 3.50, 2.80, 3.0, 3.45, 3.60, 3.90, 4.0, 3.85 };

        // ask user to enter student id number in the dialog box
        int studentID = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Jordan Romano - Part 1 Final Project: \nEnter Student ID number: "));

        // search for ID number in array
        int index = -1;
        for (int counter = 0; counter < studentIDs.length; counter++) {
            if (studentIDs[counter] == studentID) {
                index = counter;
                break;
            }
        }

        // if else statement for result or error message
        if (index != -1) { // If the entered number was found in the studentIDs array
            JOptionPane.showMessageDialog(null,
                    // display the first name and correlating GPA for the student ID number entered
                    "Student ID: " + studentIDs[index] + "\nFirst Name: " + firstNames[index] + "\nGPA: " + gpas[index]);
        } else {
            // else display the error message if the wrong ID number is entered and ask the user to try again
            JOptionPane.showMessageDialog(null, "Invalid ID number: " + studentID + ". Please try again.");
        }
    }//end method
    
}//end class
