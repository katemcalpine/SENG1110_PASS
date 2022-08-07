//--------------------------------------------------------------------
// Title: S3W4_Q5.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 13th March, 2022
// Attached to worksheet: 'Control Structures - If and Switch' (Session 3, Week 4)
//--------------------------------------------------------------------

public class Main 
{
    public static void main(String[] args) {
        if ((a < 5) && (b > 0)){
            System.out.println("Check 1.");
        }
        else if ((a >= 5) || (b < 1)) {
            System.out.println("Check 2.");
        }
        else {
            System.out.println("Check 3.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        if ((a == 5) && (b > 0)) {
            System.out.println("Check 1.");
            if ((a >= 5) || (b < 1)) {
                System.out.println("Check 2.");
                if ((a > 0) && (b < 3)) {
                    System.out.println("Check 3.");
                    System.exit(0);
                }
                System.out.println("Check 4.");
                System.exit(0);
            }
            System.out.println("Check 5.");
            System.exit(0);
        }
    }
}

