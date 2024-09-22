/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to welcome and display a user's name in a JOptionPane input and message box */
public class Program2 {
    
    /* this is the method that begins the 
    execution of the Java application */
    public static void main(String[] args) {
        
        // dialog box that stores user input in the "name" variable
        String name = javax.swing.JOptionPane.showInputDialog("Enter name:");
        //scripture variable
        String scripture = "Romans 1:20";
        
        // "welcome" variable stores the welcome message, "name" variable and the "scripture" variable
        String welcome = "Welcome, " +  name + ", To The Liberty University Website!" + " The Scripture for the day is: " + scripture;
        
        // message box displays the text and information stored in the welcome variable
        javax.swing.JOptionPane.showMessageDialog(null,welcome);  
        
    } //end method
} //end class

