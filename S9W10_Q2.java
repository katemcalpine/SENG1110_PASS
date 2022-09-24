//--------------------------------------------------------------------
// Title: S9W10_Q2.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 10th May, 2022
// Attached to worksheet: 'Classes and Methods II' (Session 8, Week 9)
//--------------------------------------------------------------------

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        // 2a.
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please select an array size between 0 and 9: ");
        int size = keyboard.nextInt();
        int[] x = new int[size];
        for (int i = 0; i < size; i++) {
            x[i] = rand.nextInt(10);
        }
        
        // 2b.
        System.out.println("Please type in an integer to search: ");
        int number = keyboard.nextInt();
        System.out.print(search(x, number));
        
        // 2c.
        x = bubble(x);
        
        // 2d.
        int[] y = new int[size];
        y = copy(x, y);
        if (equal(x, y)) {
            System.out.println("\nArray x and array y are equal");
        }
        else {
            System.out.println("\nArray x and array y do not equal");
        }
        
        // 2e.
        print(x, y);
    }
    
    static String search(int[] x, int number) {
        int i;
        for (i = 0; i < x.length; i++) {
            if (x[i] == number) {
                System.out.print("Before sorting, number was contained in index ");
                return String.valueOf(i);
            }
        }
        System.out.print("Number was not contained in array.");
        return " ";
    }
    
    static int[] bubble(int[] x) {
        int temp;
        for (int i = x.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        return x;
    }
    
    static int[] copy(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        return y;
    }
    
    static boolean equal(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
    
    static void print(int[] x, int[] y) {
        System.out.print("\nx = ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+", ");
        }
        System.out.print("\ny = ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+", ");
        }
    }
}
