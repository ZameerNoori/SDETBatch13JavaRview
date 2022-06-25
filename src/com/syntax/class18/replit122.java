package com.syntax.class18;

public class replit122 {
    String country;
    String capital;
    int populationSize;

    replit122(String country, String capital, int populationSize) {
        this.country = country;
        this.capital = capital;
        this.populationSize = populationSize;
    }

    void countryInfo() {
        System.out.println("The capital of " + country + " is " + capital + " and population is " + populationSize);
    }

    void countryInfo2() {
        System.out.println("The capital of " + country + " is " + capital + " and population is " + populationSize);
    }

    public static void main(String[] args) {
        replit122 m = new replit122("USA","Washington DC",100);
        m.countryInfo();
        replit122 ma = new replit122("AFG","PJR",200);
        ma.countryInfo2();

    }
}
