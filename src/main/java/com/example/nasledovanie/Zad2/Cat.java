package com.example.nasledovanie.Zad2;

public class Cat extends Animal{

    String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise()
    {
        System.out.println("Мяу мяу");
    }

    public void eat()
    {
        System.out.println("Кошка ест");
    }

}
