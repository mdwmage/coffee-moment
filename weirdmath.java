// Importing foreign libraries
import java.util.*;
import java.lang.*;

public class weirdmath {
    public static void main(String[] args) {
        // Behold, my Scann-inator!
        Scanner platypus =  new Scanner(System.in);
        System.out.println("Please enter a positive, 4-digit number (1111 to 9999): ");
        double bignum = platypus.nextDouble();
        platypus.close();
        int firstint = (int) Math.floor(bignum/1000);
        double num1 = Math.floor(bignum % 1000);
        int secondint = (int) Math.floor(num1/100);
        double num2 = Math.floor(num1 % 100);
        int thirdint = (int) Math.floor(num2/10);
        double num3 = Math.floor(num2 % 10);
        int fourthint = (int) Math.floor(num3/1);
        System.out.println("The digits of " + (int) bignum +" are "+ firstint +", " + secondint +", "+ thirdint +", and " + fourthint + ".");
    }
}
