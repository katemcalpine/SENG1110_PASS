//--------------------------------------------------------------------
// Title: S11W12_Q3.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 26th May, 2022
// Attached to worksheet: 'Inheritance and Polymorphism' (Session 11, Week 12)
//--------------------------------------------------------------------

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length: ");
        double length = input.nextDouble();
        System.out.println("Please enter a width: ");
        double width = input.nextDouble();
        System.out.println("Please enter a height: ");
        double height = input.nextDouble();
        Area a = new Area(length, width);
        Area v = new Volume(length, width, height); // Can also use Volume data type.
        v.printDimensions();
        System.out.println("\nTotal area = "+ a.calculation());
        System.out.println("Total volume = "+ v.calculation());
   }
}

public class Area {
    protected double length;
    protected double width;
    
    public Area() {
        length = 0;
        width = 0;
    }
    
    public Area(double l, double w) {
        setDimensions(l, w);
    }
    
    public void setDimensions(double l, double w) {
        if (l>=0) length = l;
        else length = 0;
        if (w>=0) width = w;
        else width = 0;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double calculation() {
        return length*width;
    }
    
    public void printDimensions() {
        System.out.print("\nLength = "+length +"\nWidth = "+width);
    }
}
