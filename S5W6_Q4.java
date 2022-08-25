//--------------------------------------------------------------------
// Title: S5W6_Q4.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 29th March, 2022
// Attached to worksheet: 'Classes and Methods 1' (Session 5, Week 6)
//--------------------------------------------------------------------

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a string of characters: ");
        String strWord = keyboard.next();
        char[] charAWord = strWord.toCharArray();
        int i;
        int state = 0;
        if (charAWord[0] == 'x') {
            state = 1;
            if (charAWord[1] == 'x') {
                state = 2;
            }
        }
        else if (charAWord[1] == 'x') {
            state = 3;
        }
        switch (state) {
            case 1:                     // Only the first character is an 'x'.
                for (i=1; i < strWord.length(); i++) {
                    System.out.print(charAWord[i]);
                }
                break;
            case 2:                     // The first two characters are an 'x'.
                for (i=2; i < strWord.length(); i++) {
                    System.out.print(charAWord[i]);
                }
                break;
            case 3:                     // Only the second character is an 'x'.
                System.out.print(charAWord[0]);
                for (i=2; i < strWord.length(); i++) {
                    System.out.print(charAWord[i]);
                }
            default:
                //System.out.print(strWord);
        }
    }
}
