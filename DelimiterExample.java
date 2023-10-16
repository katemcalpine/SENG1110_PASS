//--------------------------------------------------------------------
// Title: DelimiterExample.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 12th October, 2023
// Attached to: Assessment 2 Experiment (Session 10, Week 11)
//--------------------------------------------------------------------

import java.util.*;  
public class DelimiterExample {    
    public static void main(String args[]){       
          //Create Scanner object  
        Scanner scan = new Scanner("Hello there!\nDarth\nGeneral Kenobi");  
        //Printing the delimiter used  
        System.out.println("Delimiter:" + scan.delimiter());  
        //Print the Strings  
        String string1 = "Darth";
        String string2 = "Vader";
        while (scan.hasNext()) {
            String word = scan.next();
            if (word.equals(string1) || word.equals(string2)){
                word = scan.next();  //The word we don't want
            }
            System.out.println(scan.next()); //The word we do want
       }
        //Close the scanner  
        scan.close();  
        }    
}
