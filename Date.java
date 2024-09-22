package jrproject6;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to store and display dates 
using the Set and Get methods. */


public class Date { // the main public class
    private int month; //month variable
    private int day; //day variable
    private int year; //year variable
    
    
    //constructor that initializes the variables
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    //set method for the month variable
    public void setMonth(int month) {
        this.month = month;
    }//end method
    
    //get method for the month variable
    public int getMonth() {
        return month;
    }//end method
    
    //set method for the day variable
    public void setDay(int day) {
        this.day = day;
    }//end method
    
    //get method for the month variable
    public int getDay() {
        return day;
    }//end method
    
    //set method for the year variable
    public void setYear(int year) {
        this.year = year;
    }//end method
    
    //get method for the year variable
    public int getYear() {
        return year;
    }//end method
    
    //method that displays the date in the proper format with %d filling in each variable
    public void displayDate() {
        System.out.printf("Today is %d/%d/%d", month, day, year);
    }//end method
    
}//end class

