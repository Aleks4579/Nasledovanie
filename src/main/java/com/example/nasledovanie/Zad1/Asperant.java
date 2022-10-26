package com.example.nasledovanie.Zad1;

public class Asperant extends Student{

    String scientificWork;

    public Asperant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 20000;
        } else {
            return 18000;
        }
    }

}
