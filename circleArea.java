//imports
import java.util.*;
import java.io.*;

public class circleArea {
    public static void main(String[] args){
        // Make scanner
        Scanner circleScan = new Scanner(System.in);
        // Area equation
        System.out.println("Enter the radius:");
        double radius = circleScan.nextDouble();
        System.out.println("A = " + (3.14*radius*radius)*10/10 + " units ^2");
        System.out.println("C = " + (2*3.14*radius)*10/10 + " units");
    }
}
