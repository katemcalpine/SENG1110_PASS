//--------------------------------------------------------------------
// Title: S11W12_Q4.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 26th May, 2022
// Attached to worksheet: 'Inheritance and Polymorphism' (Session 11, Week 12)
//--------------------------------------------------------------------

public class Volume extends Area {
    private double height;
    
    public Volume() {
        super();
        height = 0;
    }
    
    public Volume(double l, double w, double h) {
        super(l, w);
        setDimensions(l, w, h);
    }
    
    public void setDimensions(double l, double w, double h) {
        super.setDimensions(l, w);
        if (h >= 0) {
            height = h;
        }
        else {
            height = 0;
        }
    }
    
    public double calculation() {
        return getLength()*getWidth()*getHeight();
    }
    
    public double getHeight() {
        return height;
    }
    
    public void printDimensions() {
        super.printDimensions();
        System.out.println("\nHeight = " + getHeight());
    }
}
