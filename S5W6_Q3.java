//--------------------------------------------------------------------
// Title: S5W6_Q3.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 29th March, 2022
// Attached to worksheet: 'Classes and Methods 1' (Session 5, Week 6)
//--------------------------------------------------------------------

import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter in a words that is 3 letters or longer, and has an ofdd amount of letters: ");
    String strWord = keyboard.next();
    while (strWord.length() < 3)
    {
      System.out.print("Please enter in a words that is 3 letters or longer, and has an ofdd amount of letters: ");
      strWord = keyboard.next();
    }
    char[] charAWord = strWord.toCharArray();
    System.out.print("Middle 3 letters are: " + charAword[(strWord.length()/2)-1] + charAWord[strWord.length()/2] + charAWord[strWord.length()/2)+1]);
  }
}
