package jrfinalproject;
/* The purpose of this application is to provide the user with a menu that 
provides days of the week and returns business hours for the day that the user requests. 
If the user enters an invalid request it will return an error message*/
    
import java.util.Scanner; //import scanner

public class Part2 {
    enum Day { //enumeration representing the days of the week
        MONDAY("9am - 5pm"), 
        TUESDAY("9am - 5pm"),
        WEDNESDAY("9am - 5pm"),
        THURSDAY("10am - 6pm"),
        FRIDAY("10am - 6pm"),
        SATURDAY("11am - 4pm"),
        SUNDAY("Closed");
        
        //stores business hours for the business day
        private String hours;
        
        //constructor that sets business hours that correspond with the days
        Day(String hours) {
            this.hours = hours;
        }
        //get method that returns business hours for a day
        public String getHours() {
            return hours;
        }
    }

    public static void main(String[] args) {
        System.out.println("(Jordan Romano - Part 2 Final)"); //prints name and assignment name
        // display list of days
        System.out.println("Business hours:");
        for (Day day : Day.values()) {
            System.out.println(day.name());
        }

        // prompt user for day
        Scanner scanner = new Scanner(System.in); //create new scanner
        System.out.print("Enter a day: "); //promts user to enter a day in the scanner
        String userInput = scanner.nextLine().toUpperCase(); //scanner reads input

        // get business hours for chosen day
        try {
            //convert the user input to a Day enumeration value
            Day chosenDay = Day.valueOf(userInput);
            System.out.println("Business hours for " + chosenDay.name() + ": " + chosenDay.getHours()); //print result
        } catch (IllegalArgumentException e) { //error catching
            System.out.println("Invalid day entered."); // error messsage
        }
    }// end method
}// end class
