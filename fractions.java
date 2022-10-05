import java.lang.*;
import java.io.*;
import java.util.*;

public class fractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numerator=");
        int nom = input.nextInt();
        System.out.println("denominator=");
        int dem = input.nextInt();
        int newnom = nom % dem;
        int flow = nom / dem;
        System.out.println(nom + " / " + dem + " is equivalent to " + flow + " and " + newnom + " / " + dem);
        input.close();
    }
}
