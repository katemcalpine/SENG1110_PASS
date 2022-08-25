//--------------------------------------------------------------------
// Title: S5W6_Q2a.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 29th March, 2022
// Attached to worksheet: 'Classes and Methods 1' (Session 5, Week 6)
//--------------------------------------------------------------------

public class Flowers
{
  private String name;
  
  public void setName(String flower)
  {
    name = flower;
  }
  
  public String getName()
  {
    return name;
  }
}

public class Main
{
  public static void main(String[] args)
  {
    Flowers flos = new Flowers();
    flos.setName("Daisy");
    System.outprintln("Flower name is: " + flos.getName());
  }
}
