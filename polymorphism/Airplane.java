package com.traffic;
 
public class Airplane extends Traffic {
    String name = "Airplane";
    public void whoAmI(Traffic a){
        System.out.println(name + " can load " + a.getPC() + " people.");
    }
}
