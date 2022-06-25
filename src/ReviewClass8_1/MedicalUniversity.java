package ReviewClass8_1;

import ReviewClass8.Doctor;

public class MedicalUniversity {

    public static void main(String[] args) {

        Doctor doc = new Doctor("John", "Smith");
        //only public is visible/accessible in different package
        doc.printInfo();
        Doctor.study("GW");

    }
}
