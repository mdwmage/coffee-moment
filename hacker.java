// Pirate Libraries
import java.io.*;
import java.lang.*;
import java.util.*;

public class hacker {
    public static void main(String[] args) {
        int adjcount = 13;
        String first[] = new String[adjcount];
        first[0] = "Crash";
        first[1] = "The";
        first[2] = "Zero";
        first[3] = "Cereal";
        first[4] = "Lord";
        first[5] = "Master of";
        first[6] = "Kryptonic";
        first[7] = "Hypr";
        first[8] = "Acid";
        first[9] = "Electric";
        first[10] = "Sonic";
        first[11] = "Phantom";
        first[12] = "Elite";
        int nouncount = 12;
        String last[] = new String[nouncount];
        last[0] = "Override";
        last[1] = "Plague";
        last[2] = "Cool";
        last[3] = "Killer";
        last[4] = "Nikon";
        last[5] = "Disaster";
        last[6] = "Cowboy";
        last[7] = "Samuri";
        last[8] = "Burn";
        last[9] = "Blade";
        last[10] = "Sandwich";
        last[11] = "Phreak";
        int SN = (int) Math.round(Math.random()*(adjcount-1));
        int LN = (int) Math.round(Math.random()*(nouncount-1));
        System.out.println("Getting ur awesome hackr name");
        System.out.println("Ur name is:");
        System.out.println(first[SN] + " " + last[LN]);
    }
}
