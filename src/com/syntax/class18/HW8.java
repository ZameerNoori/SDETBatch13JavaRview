package com.syntax.class18;

public class HW8 {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    public HW8 (String HW8Name1, String HW8Address1){
        name=HW8Name1;
        address=HW8Address1;
    }
    void displayInfo(){
        System.out.println(name+" in "+address);
    }

    public static void main(String[] args) {
        HW8 aliens=new HW8("Aliens", "Mars");
        aliens.displayInfo();
    }
}
