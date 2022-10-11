//--------------------------------------------------------------------
// Title: S10W11_Q2.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 17th May, 2022
// Attached to worksheet: 'Arrays II' (Session 10, Week 11)
//--------------------------------------------------------------------

import java.util.*; 

public class Main
{
    public static void main(String[] args) {
        int petalNumber = 0;
        Scanner Input = new Scanner(System.in);
        final int MAX = 5;
        Flower[] f = new Flower[MAX];
        int counter = 1;
            
        for (int i = 0; i < MAX; i++) {
            f[i] = new Flower();
            System.out.print("Please type in the number of flower petals found on specimen number "+(counter));
            petalNumber = Input.nextInt();      // Should also code what happens if there is no integer input.
            f[i].setName(petalNumber);
            boolean result = check(counter, f);
            while (result == true) {
                System.out.print("Flower has already been recorded. Please enter the number of flower petals on the next specimen: ");
                petalNumber = Input.nextInt();      // Should also code what happens if there is no integer input.
                f[i].setName(petalNumber);
                result = check(counter, f);
            }
            counter++;
        }
        for (int i = 1; i <= MAX; i++)
            System.out.println("Flower "+(i)+": "+f[i-1].getName());  
    }
    
    public static boolean check(int counter, Flower[] f) {
        for (int i = 0; i < counter-1; i++) {
            if (f[i].equals(f[counter-1])) {
                return true;
            }
        }
        return false;
    }
}  

public class Flower {
    private String name;
    private String petalNumber;
    
    public void setName(int petalNumber) {
        name = flowerType(petalNumber);
        petalNumber = petalNumber;
        // Threw this in to add more variables to compare in the equals method.
    }
    
    private String flowerType(int petalNumber) {
        switch(petalNumber) {
            case 3: 
                return "Trillium grandiflorum";
            case 4: 
                return "Oenothera villosa";
            case 5:
                return "Catharanthus roseus";
            case 6:
                return "Hypoxis hirsuta";
            default:
                return "not in database";
        }
    }
    
    public String getName() {
        return name;
    }
    
    public boolean equals(Flower otherId) {
        return ((this.name.equalsIgnoreCase(otherId.name)) && (this.petalNumber == otherId.petalNumber));
    }
}
