//Imports
import java.lang.*;
import java.io.*;
import java.util.*;

public class rounding {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner input = new Scanner(System.in);
        double dec = input.nextDouble();
        System.out.println("Number of decimal places: ");
        int mult = input.nextInt();
        double num = Math.pow(10, mult);
        System.out.println(Math.round(dec * num) / num);
    }
}
