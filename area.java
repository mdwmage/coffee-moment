// Imports
import java.io.*;
import java.util.*;

public class area {
    public static void main(String[] args) {
        // Declare Scanner
        Scanner user_input = new Scanner(System.in);

        // Area Program
        System.out.println("Welcome to my Area Program!");

        // Get Variables
        System.out.println("Enter the length: ");
        int length = user_input.nextInt();
        System.out.println("Enter the width: ");
        int width = user_input.nextInt();
        
        // Calculate Output
        int area = length*width;
        System.out.println("Area = " + area);
    }
}
