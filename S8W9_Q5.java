//--------------------------------------------------------------------
// Title: S8W9_Q5.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 4th May, 2022
// Attached to worksheet: 'Classes and Methods II' (Session 8, Week 9)
//--------------------------------------------------------------------

public class Main
{
    public static void main(String[] args) {
        Output.display(42);
        Output.display(13, 37);
        Output.display(1.61, 2.71, 3.14);
    }
}

public class Output {
    public static void display(int a) {
        System.out.println("First argument: "+a+"\n");
    }
    
    public static void display(int b, int c) {
        System.out.println("First argument: "+b+"\nSecond argument: "+c+"\n");
    }
    
    public static void display(double d, double e, double f) {
        System.out.println("First argument: "+d+"\nSecond argument: "+e+"\nThird argument: "+f+"\n");
    }
}
