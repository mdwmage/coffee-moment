// Imports
import java.util.*;
import java.io.*;

public class GradeAverage {
    public static void main(String[] args){
        Scanner grde = new Scanner(System.in);
        System.out.println("Enter four course grades:");
        double markA = grde.nextDouble();
        double markB = grde.nextDouble();
        double markC = grde.nextDouble();
        double markD = grde.nextDouble();
        System.out.println("The average is: " + (markA+markB+markC+markD)/4);
    }
}
