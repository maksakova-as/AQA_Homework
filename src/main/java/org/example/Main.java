package org.example;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(15);
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Васька")
        };
        Dog dog = new Dog("Бобик");

        dog.run(600);
        cats[0].run(150);

        System.out.println("\n=== Кормление котов ===");
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 7);
        }

        System.out.println("\n=== Состояние котов ===");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFed() ? "Сыт" : "Голоден"));
        }

        bowl.addFood(10);

        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
    }
}