package com.syntax.class22;

public class CreditCardHW2 {
    /*
Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    int balance;
    double interest;

    void cal(int bal, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println(bal * (interest / 100));
    }

    static class Visa extends CreditCardHW2 {
    }

    static class AX extends CreditCardHW2 {
        @Override
        void cal(int balance, double interest) {
            this.balance = balance;
            this.interest = interest;
            System.out.println(balance * (interest / 100));
        }

    }

    public static void main(String[] args) {
        CreditCardHW2 hw2 = new CreditCardHW2();
        hw2.cal(2000, 10.5);
        Visa v = new Visa();
        v.cal(1000, 30.5);
        AX ax = new AX();
        ax.cal(5000, 60.5);
    }
}
