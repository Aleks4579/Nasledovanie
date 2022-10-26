package com.example.nasledovanie.Zad1;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Maksim", "Basov", "PKS-419", 4.5);
        Asperant asp1 = new Asperant("Sergay", "Sergayev", "PKS-419", 5, "Web-site");
        Student st2 =new Student("Bob", "Marlya", "PD-419", 5);
        Student[] students = { st1, asp1, st2 };

        for (Student s : students)
            System.out.println(s.getScholarship());


    }

}