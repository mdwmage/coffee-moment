// Import
import java.lang.*;
import java.util.*;
import java.io.*;

public class bettermath {
    public static void main(String[] args){
        // Square root
        System.out.println("Square Root \nInput a positive number:");
        // Scanner
        Scanner input = new Scanner(System.in);
        // Back to square root
        int Root = input.nextInt();
        System.out.println("The square root of " + Root + " is " + Math.sqrt(Root));
        System.out.println("\n\n****\n\n");
        // Exponents
        System.out.println("Exponents \nInput an integer:");
        int ex1 = input.nextInt();
        System.out.println("Input a second integer:");
        int ex2 = input.nextInt();
        System.out.println(ex1 + " to the power of " + ex2 + " is: " + Math.pow(ex1, ex2));
        System.out.println("\n\n****\n\n");
        // Rounding
        System.out.println("Rounding, Ceiling and Floor \nInput a decimal value:");
        float bullet = input.nextFloat();
        System.out.println(bullet + " rounds to " + Math.round(bullet));
        System.out.println(bullet + " ceiling is " + Math.ceil(bullet));
        System.out.println(bullet + " floor is " + Math.floor(bullet));
        System.out.println("\n\n****\n\n");
        // Random 
        System.out.println("Random \nEnter the lower limit:");
        int low = input.nextInt();
        System.out.println("Enter the upper limit:");
        int high = input.nextInt();
        System.out.println("A random number between " + low + " and " + high + " is " + Math.floor((high - low)*Math.random() + low));
    }
}
