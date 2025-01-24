package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Animal animal;

    public Lion(String sex, Animal animal) throws Exception {
        this.animal = animal;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

//    Feline feline = new Feline();

    public int getKittens() {
        return animal.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animal.getFood("Хищник");
    }
}
