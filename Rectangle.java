package jrproject6b;
/* Jordan Romano - CSIS 212(B01)
The purpose of this program is to store get and set length and width data using 
the Set and Get methods and calculate area and perimeter
  */

public class Rectangle { //public class
    double length; //variable named length
    double width; //variable named width

    public Rectangle() { //constructor where length and width variables are set to 1
        length = 1; //set to 1
        width = 1; // set to 1
    }
    //get method for the length variable
    public double getLength() {
        return length;
    }
    //set method for the length variable
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) { //length must be greater than 0 or less than 20
            this.length = length;
        }
    }
    //get method for the width variable
    public double getWidth() {
        return width;
    }
    //set method for the width variable
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) { //wifth must be greater than 0 or less than 20
            this.width = width;
        }
    }

    //method that calculates area by multiplying length and width variables
    public double getArea() {
        return length * width;
    }
    //method that calculates perimeter by adding length and width then multiplying it by 2 
    public double getPerimeter() {
        return 2 * (length + width);
    }
}//end class
