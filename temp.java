// Imports
import java.io.*;
import java.util.*;
import java.lang.*;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Temp in F:");
         double F = input.nextDouble();
         double C = 5.0/9.0*(F-32.0);
         C = C*10;
         double PC = Math.round(C);
         PC = PC/10;
         System.out.println("Temp in C: \n" + PC);
    }
}
