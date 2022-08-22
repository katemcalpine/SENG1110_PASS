//--------------------------------------------------------------------
// Title: S4W5_Q3.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 22nd March, 2022
// Attached to worksheet: 'Loop Statements – While, Do-While, For' (Session 4, Week 5)
//--------------------------------------------------------------------

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int n;
    int x = 0;
    int x1 = 0;
    int x2 = 1;
    System.out.print("Please enter an integer between 0 an 9: ");
    n = keyboard.nextInt();
    while ((n < 0) || (n > 9))
    {
      System.out.print("Please enter an integer between 0 and 9: ");
      n = keyboard.nextInt();
      if ((n >= 0) && (n <= 9))
      {
        break;
      }
    }
    System.out.println(x);
    for (int i = 1; i < n; i++)
    {
      x = x1 + x2;
      x2 = x1;
      x1 = x;
      System.out.println(x);
    }
  }
}
