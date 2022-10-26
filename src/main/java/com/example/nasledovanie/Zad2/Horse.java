package com.example.nasledovanie.Zad2;

public class Horse extends Animal{

    String name;
    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;

    }

    public void makeNoise()
    {
        System.out.println("Игого игого");

    }
    public void eat()
    {
        System.out.println("Лошадь ест");
    }



}
