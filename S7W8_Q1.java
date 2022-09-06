//--------------------------------------------------------------------
// Title: S5W6_Q4.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 26th April, 2022
// Attached to worksheet: 'Encapsulation and UML Diagrams' (Session 7, Week 8)
//--------------------------------------------------------------------

import java.util.*; 

public class Main
{
    public static void main(String[] args) {
        int petalNumber = 0;
        Scanner Input = new Scanner(System.in);
        Flower Id = new Flower();
        
        System.out.println("Please type in the number of flower petals found on the specimen");
        petalNumber = Input.nextInt();      // Should also code what happens if there is no integer input.
        Id.setName(petalNumber);
        System.out.println("Flower is " + Id.getName());
        
    }
}

//--------------------------------------------------------------------

public class Flower {
    private String name;
    
    public void setName(int petalNumber) {
        name = flowerType(petalNumber);
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
}
