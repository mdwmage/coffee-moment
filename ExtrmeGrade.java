// Imports
import java.util.*;
import java.io.*;

public class ExtrmeGrade {
    public static void main(String[] args){
        // Create scanner
        Scanner markScanner = new Scanner(System.in);
        System.out.println("Enter mark 1:");
        double mark1 = markScanner.nextDouble();
        System.out.println("Marks: " + mark1);
        System.out.println("Enter mark 2:");
        double mark2 = markScanner.nextDouble();
        System.out.println("Marks: " + mark1 + ", " + mark2);
        System.out.println("Mark total is " + (mark1+mark2));
        System.out.println("Enter mark 3:");
        double mark3 = markScanner.nextDouble();
        System.out.println("Marks: " + mark1 +", "+ mark2 +", "+ mark3);
        System.out.println("Mark total is " + (mark1+mark2+mark3));
        System.out.println("Enter mark 4:");
        double mark4 = markScanner.nextDouble();
        System.out.println("Marks: " + mark1 +", "+ mark2 +", "+ mark3 +", "+ mark4);
        System.out.println("Mark total is " + (mark1+mark2+mark3+mark4));
        System.out.println("The average is " + (mark1+mark2+mark3+mark4)/4);
    }
}