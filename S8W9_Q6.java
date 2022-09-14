//--------------------------------------------------------------------
// Title: S8W9_Q6.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 4th May, 2022
// Attached to worksheet: 'Classes and Methods II' (Session 8, Week 9)
//--------------------------------------------------------------------

import java.util.*; 

public class Main
{
    public static void main(String[] args) {
        int petalNumber = 0;
        Scanner Input = new Scanner(System.in);
        Flower Id1 = new Flower();
        Flower Id2 = new Flower();
        
        System.out.println("Please type in the number of flower petals found on the first specimen");
        petalNumber = Input.nextInt();      // Should also code what happens if there is no integer input.
        Id1.setName(petalNumber);
        System.out.println("Please type in the number of flower petals found on the second specimen");
        petalNumber = Input.nextInt();
        Id2.setName(petalNumber);
        if (Id1.equals(Id2)) {
            System.out.println("These are both "+Id2.getName());
        }
        else {
            System.out.println("These are not the same flowers. The first is "+Id1.getName()+". The second is "+Id2.getName()+".");
        }
        
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
