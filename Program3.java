/* Jordan Romano - CSIS 212(B01)
The purpose of this is to demonstrate three different techniques used to print text on Java */
public class Program3 {
    
    /* this is the method that begins the 
    execution of the Java application */
        public static void main(String[] args)
    {
        //A println() statement
        System.out.println("1 2 3 4");
        
        //4 print() statements displaying 1-4
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");
        
        //A printf() statement with formatting
        System.out.printf("%n%s%n", "1 2 3 4");
                
    } //end class
} //end method
