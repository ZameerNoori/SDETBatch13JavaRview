package com.syntax.class18;

public class HW7 {
    /*
    Write program that have static constructor and observe result.
     */
    static String car;
    static String model;
    public HW7 (String HW7car, String HW7model){
        car=HW7car;
        model= String.valueOf(HW7model);
    }
    void car(){
        System.out.println(car+model+" is one of the craziest production cars in the United States");
    }

    public static void main(String[] args) {
        HW7 dodge= new HW7("Dodge ","Demon");

        dodge.car();


    }

}
