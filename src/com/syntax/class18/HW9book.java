package com.syntax.class18;

public class HW9book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String book;
    int pages;
    HW9book (String book){
        this.book=book;
        System.out.println("The book is called "+ book);
    }
    HW9book (){
        pages=278;
        System.out.println("and it has "+pages+" pages.");
    }
    public static void main(String[] args) {
        HW9book print=new HW9book("Earth Hive");
        HW9book print2=new HW9book();
    }
}
