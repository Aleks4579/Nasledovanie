package com.example.nasledovanie.Zad2;

public class Main {

    public static void main(String[] args){

        Vet Vet = new Vet();

        Dog dog1 = new Dog("Мясо", "Дом", "Жучка");
        Cat cat1 = new Cat("Рыба", "Дом", "Барсик");
        Horse horse1 = new Horse("Сено", "Ферма", "Молния");

        Animal[] animals = {dog1, cat1, horse1};
        for (Animal s : animals)
            Vet.treatAnimal(s);

    }

}
