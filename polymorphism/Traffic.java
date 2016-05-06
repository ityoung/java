package com.traffic;
 
public class Traffic {
    String name = "Traffic";
    private int passengerCapacity;
    //Encapsulate passengerCapacity, just for test :D
    public int getPC(){
        return passengerCapacity;
    }
    public void setPC(int newPC){
        passengerCapacity = newPC;
    }
    /**
     * @param a
     */
    public void whoAmI(Traffic a){
        System.out.println(name + " can load " + a.getPC() + "people.");
    }
}
