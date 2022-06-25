package com.syntax.class20;

public class HW1 {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    long mobileNumber;

    HW1(String name, long mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public static class userInfo extends HW1 {
        String address;

        userInfo(String name, long mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        void personalInfo() {
            System.out.println("I m " + name + ", my phone # is " + mobileNumber + ", and I live in " + address);
        }

        public static void main(String[] args) {
            userInfo print = new userInfo("Z", 12345677891l, "VA");
            print.personalInfo();
        }
    }
}