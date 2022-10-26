package com.example.nasledovanie.Zad2;

public class Animal {

    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("издает естественные звуки...");

    }
    public void eat() {
        System.out.println("Ест...");
    }

    public void sleep() {
        System.out.println("Спит...");
    }

}
