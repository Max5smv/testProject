package org.example;

public class Cats {
    public String name;
    public String surName;
    public int age;

    public Cats(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void Info(){
        System.out.println(this.name + "; " + this.surName + "; " + this.age);

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return this.surName + " Update!!";
    }
}