package org.example;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("=== Информация о фигуре ===");
        System.out.println("Тип: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println("==========================\n");
=======
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
>>>>>>> 6b611d36ef9e99f7539a70f4eaf04236953d394a
    }
}