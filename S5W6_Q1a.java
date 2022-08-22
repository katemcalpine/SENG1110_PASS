//--------------------------------------------------------------------
// Title: S5W6_Q1a.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 29th March, 2022
// Attached to worksheet: 'Classes and Methods 1' (Session 5, Week 6)
//--------------------------------------------------------------------

public class Main
{
    public static void main(String[] args) {
        
        int x = 0;
        for (int i = 0; i < 10; i++) {
        	int temp = x;
        	temp++;
        	x = temp;
        }
        System.out.println(x);
    }
}
