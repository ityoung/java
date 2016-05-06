package com.traffic;
 
public class Car extends Traffic {
    String name = "Car";
    public void whoAmI(Traffic a){
        System.out.println(name + " can load " + a.getPC() + " people.");
    }
}
