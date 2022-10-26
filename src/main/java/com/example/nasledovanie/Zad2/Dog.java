package com.example.nasledovanie.Zad2;

public class Dog extends Animal{

    String name;
    public Dog (String food, String location, String name) {
        super(food, location);

        this.name = name;
    }

    public void makeNoise()
    {
        System.out.println("ГАв гав");
    }

    public void eat()
    {
        System.out.println("Собака ест");
    }

}

