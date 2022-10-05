// Imports
import java.util.*;
import java.io.*;
import java.lang.*;

public class change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();
        int quarters = cents / 25;
        int cents2 = cents % 25;
        int dimes = cents2 / 10;
        int cents3 = cents2 % 10;
        int nickels = cents3 / 5;
        int cents4 = cents3 % 5;
        int pennies = cents4 / 1;
        System.out.println("Quarters " + quarters + ", dimes " + dimes + ", nickels " + nickels + ", pennies " + pennies);
    }
}
