//--------------------------------------------------------------------
// Title: S2W3_Q6.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 6th March, 2022
// Attached to worksheet: 'Java Basics' (Session 2, Week 3)
//--------------------------------------------------------------------

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double hours;                                 // Will be initialised when hours are input.
    final double PAY_RATE = 1000.00;              // Initialising a constant.
    double total;                                 // Will be initialised after calculation.
    System.out.println("Please enter the hours you worked: ");
    hours = keyboard.nextDouble();                // Only accepts an input that fits into a double.
    total = hours * PAY_RATE;
    System.out.printf("Total pay you will receive is: $%.2f", total); // Very C syntax.
  }
}
