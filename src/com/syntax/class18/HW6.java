package com.syntax.class18;

public class HW6 {
    /*
Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
 and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class
 inside different package  and observe result.
     */
    public HW6(String a){
        System.out.println(a+" public");
    }
    private HW6(){
        System.out.println("limited");
    }
    protected HW6(int y){
        System.out.println("pro");
    }
    HW6(boolean t){
        System.out.println("default");
    }

    public static void main(String[] args) {
        HW6 str=new HW6(1);
        HW6 str1=new HW6("demon");
        HW6 str3=new HW6(true);
        HW6 str4=new HW6();
    }

}
