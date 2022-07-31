//--------------------------------------------------------------------
// Title: S1W2_Q4.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 2nd March, 2022
// Attached to worksheet: 'Admin and Getting Started with Java' (Session 1, Week 2)
//--------------------------------------------------------------------

import java.util.*;
public class Main
{
  public static void main (String[] args)
  {
    Scanner console = new Scanner(System.in);
    int radius;
    double area;
    System.out.println("Please Enter Radius: ");
    radius = console.nextInt();
    area = 3.14 * radius * radius;
    System.out.print("The circle area is " + area);
  }
}
