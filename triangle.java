// Imports
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get lengths
        System.out.println("Enter three sides of a triangle:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // Finished inputs, close scanner
        input.close();

        // Perimetre Math
        double pm = (x+y+z);
        int perimetre = (int) (x+y+z);
        double spm = pm/2;
        double qpm = Math.floor(spm*10.0);
        double semi_perimetre = qpm/10.0;

        // variables for simplificaton
        double q = x*y*z;
        double s = pm/2.0;

        // Area and Radius MAth
        double ar = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        double qar = Math.round(ar*10.0);
        double area = qar/10.0;
        // Circumscribed Circle
        double qR = q/(4.0*ar);
        double pR = Math.round(qR*10.0);
        double R = pR/10.0;
        // Inscribed Circle
        double qr = (ar*2.0)/perimetre;
        double pr = Math.round(qr*10.0);
        double r = pr/10.0;

        // Some set up for angles
        double sx = Math.pow(x, 2);
        double sy = Math.pow(y, 2);
        double sz = Math.pow(z, 2);

        // Get Angle X
        double qx = Math.acos((sy+sz-sx)/(2.0*y*z));
        double tx = qx*(180.0/Math.PI);
        double X = tx*10.0;
        double Xt = Math.round(X);
        double ax = Xt/10.0;

        // Get Angle Y
        double qy = Math.acos((sx+sz-sy)/(2.0*x*z));
        double ty = qy*(180.0/Math.PI);
        double Y = ty*10.0;
        double Yt = Math.round(Y);
        double ay = Yt/10.0;

        // Get Angle X
        double qz = Math.acos((sy+sx-sz)/(2.0*y*x));
        double tz = qz*(180.0/Math.PI);
        double Z = tz*10.0;
        double Zt = Math.round(Z);
        double az = Zt/10.0;

        // Print values
        System.out.println("\nHere are the calculations:");
        System.out.println("Perimeter = " + perimetre + "\nSemi-perimeter = " + semi_perimetre + "\nArea = " + area + "\nRadius of the Circumscribed Circle = " + R + "\nRadius of the Inscribed Circle = " + r);
        System.out.println("Angle X = " + ax + "\nAngle Y = " + ay + "\nAngle Z = " + az);
    }
}