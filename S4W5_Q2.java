//--------------------------------------------------------------------
// Title: S4W5_Q2.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 22nd March, 2022
// Attached to worksheet: 'Loop Statements – While, Do-While, For' (Session 4, Week 5)
//--------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        while ((a <= 6) && (b < 3)) {
            if (a < 5) {
                System.out.println("Check 1.");
            }
            else if (b > 1) {
                System.out.println("Check 2.");
            }
            else {
                System.out.println("Check 3.");
            }
            a++;
            b--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        do {
            if (a < 5) {
                System.out.println("Check 1.");
            }
            else if (b > 1) {
                System.out.println("Check 2.");
            }
            else {
                System.out.println("Check 3.");
            }
            a++;
            b--;
        } while ((a <= 6) && (b < 3));
    }
}

public class Main {
    public static void main(String[] args) {
        int a;
        int b = 3;
        for (a = 1; b >= -1; a++) {
           if ((a < 5) && (b > 0)) {
            System.out.println("Check 1.");
            if ((a >= 5) || (b == 1)) {
                System.out.println("Check 2.");
                if ((a > 0) && (b < 4)) {
                    System.out.println("Check 3.");
                }
                System.out.println("Check 4.");
            }
            System.out.println("Check 5.");
            }
        b--;
        }
        
    }
}
