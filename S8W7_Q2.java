//--------------------------------------------------------------------
// Title: S8W7_Q2.java
// Author: Kate McAlpine
// Email: kate.mcalpine@newcastle.edu.au
// Created: 4th May, 2022
// Attached to worksheet: 'Classes and Methods II' (Session 8, Week 9)
//--------------------------------------------------------------------

public class Main
{
    public static void main(String[] args) {
        Person p = new Person("Picard", 96);
        System.out.println("Name: "+p.getName()+"\nAge: "+p.getAge());
    }
}

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
