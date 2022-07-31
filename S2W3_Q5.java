//--------------------------------------------------------------------
// Title: S2W3_Q5.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 6th March, 2022
// Attached to worksheet: 'Java Basics' (Session 2, Week 3)
//--------------------------------------------------------------------

public class Main
{
  public static void main(String[] args)
  {
    int var1 = 0;
    float var2 = 1.0f;
    String var3 = "Hello there ";
    var2 += var1;
    var1 -= var2;
    var1 *= var2 + 1;
    var2 %= var1;
    System.out.println(var2++);
    System.out.println(++var2);
    System.out.println("\"octothorpe\"");
    var1 = var3.length();
    var1 = var3.indexOf("there");
    var1 = var3.compareTo("General Kenobi.");
    var3 = var3.concat("General Kenobi.");
  }
}
