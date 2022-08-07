//--------------------------------------------------------------------
// Title: S3W4_Q6.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 13th March, 2022
// Attached to worksheet: 'Control Structures - If and Switch' (Session 3, Week 4)
//--------------------------------------------------------------------

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        double operandOne;
        double operandTwo;
        double result;
        System.out.print("Please enter a number: ");
        operandOne = keyboard.nextDouble();
        System.out.print("Please enter a divisor: ");
        operandTwo = keyboard.nextDouble();
        result = operandOne % operandTwo;
        if (result == 0)
        {
            result = 0;  
        }
        else
        {
            result = 1;
        }
        switch ((int)result) 
        {
            case 0: 
                System.out.println(operandOne + " is a multiple of " + operandTwo);
                break;
            case 1:
                System.out.println(operandOne + " is not a multiple of " + operandTwo);
                break;
        }
    }
}
