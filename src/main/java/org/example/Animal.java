package org.example;

public class Animal {
    private static int animalCount = 0;
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + (distance <= runLimit ?
                " пробежал " + distance + " м." :
                " не может пробежать " + distance + " м."));
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать");
        } else {
            System.out.println(name + (distance <= swimLimit ?
                    " проплыл " + distance + " м." :
                    " не может проплыть " + distance + " м."));
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}