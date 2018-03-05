package com.haysarodrigues.headfirstjava.chapter2;

public class Dog {

    private int size;
    private String breed;
    private String name;

    public void bark() {

        if (size > 60) {
            System.out.println("Ruff!");
        } else if (size >= 70) {
            System.out.println("Ruff! 70MORE");
        } else {
            System.out.println("Nothing else.....");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
