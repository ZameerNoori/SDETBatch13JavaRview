package ReviewClass8_1;

import ReviewClass8.Doctor;

public class Practice extends Doctor {

    Practice(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public static void main(String[] args) {

        Practice doc = new Practice("John", "Smith");
        doc.printInfo();
        doc.work();
        Doctor.study("Syntax");
    }
}