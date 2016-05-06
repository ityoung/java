package com.traffic;
 
public class Boat extends Traffic {
    String name = "Boat";
    public void whoAmI(Traffic a){
        System.out.println(name + " can load " + a.getPC() + " people.");
    }
}
