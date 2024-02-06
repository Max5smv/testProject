package org.example;

public class Fish {
    public String name;
    public int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" +   name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
