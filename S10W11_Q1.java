//--------------------------------------------------------------------
// Title: S10W11_Q1.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 17th May, 2022
// Attached to worksheet: 'Arrays II' (Session 10, Week 11)
//--------------------------------------------------------------------

public class Main
{
    public static void main(String[] args) {
        int[] i = new int[1];
        System.out.println(i[0]);
        float[] f = new float[1];
        System.out.println(f[0]);
        double[] d = new double[1];
        System.out.println(d[0]);
        char[] c = new char[1];
        System.out.println(c[0]);   // Prints a null character
        System.out.println("\0");   // Manually printing a null character
        System.out.println(Character.getNumericValue(c[0]));    // Value when null character converted to int
        String[] S = new String[1];
        System.out.println(S[0]);
        boolean[] b = new boolean[1];
        System.out.println(b[0]);
       
    }
}
