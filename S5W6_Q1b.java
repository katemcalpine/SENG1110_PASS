//--------------------------------------------------------------------
// Title: S5W6_Q1b.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 29th March, 2022
// Attached to worksheet: 'Classes and Methods 1' (Session 5, Week 6)
//--------------------------------------------------------------------

public class Tricky {
    private int j;
    
    int trickOne(int a, int b) {
    	int j = 0;
    	for (int i = a; i <= b; i++) {
    		j += i;
    	}
    	return j;
    }
    
    int trickTwo(int x) {
	    int i = 2 * x;
	    int j = 0;
	    if (i > 10) {
	    	j = x / 2;
	    } 
	    else {
		    j = x / 3;
    	}
	    return --j;
    }
}

public class Main
{
    public static void main(String[] args) {
        int x = 10;
        int m = 5;
        int y = 8;
        Tricky t = new Tricky();
        System.out.println(t.trickTwo(t.trickOne(m, y)));
    }
}
