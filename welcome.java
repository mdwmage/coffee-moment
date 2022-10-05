//Imports
import java.io.*;
import java.util.*;
import java.lang.*;

public class welcome {
    public static void main(String[] args) {
        // Make Scanner and constant
        Scanner input = new Scanner(System.in);
        final String school = "Colonel By";
        // Output first, ask questions later
        System.out.println("Where were you born?  Enter a string value:");
        String birthp = input.nextLine();
        System.out.println("What is your middle initial? Enter a character:");
        char i = input.nextLine().charAt(0);
        System.out.println("What year were you born?  Enter the 4 digit integer value:");
        int year = input.nextShort();
        System.out.println("Pick a number between 16 and 17.  Enter the decimal number:");
        float age = input.nextFloat();
        System.out.println("Thank you for your input.");
        System.out.println(birthp + " is beautiful.");
        System.out.println(i + ", can I call you, \"" + i + "\" - I think you must be " + year + " + " + age +  " years old and attend \"" + school + "\".");
        input.close();
    }
}