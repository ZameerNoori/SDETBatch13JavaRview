package com.syntax.class18;

public class HW4 {
    /*
Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String model;
    String HP;
    String zeroToSixty;

    public HW4(){
    }
    public HW4(String HW4model,String HW4HP, String HW4zeroToSixty) {
        model = HW4model;
        HP =  HW4HP;
        zeroToSixty = HW4zeroToSixty;
    }
    void muscle() {
        System.out.println("Model:"+model +" HorsePower:"+ HP +" 0-60:"+ zeroToSixty);
    }
}
