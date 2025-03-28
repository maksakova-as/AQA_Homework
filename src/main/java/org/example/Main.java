package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(taskfive(10, 9));
        System.out.println(taskfive(10, 15));
        tasksix(10);
        System.out.println(taskseven(10));
        taskeight("Hello", 5);
        System.out.println(tasknine(2000));
        System.out.println(tasknine(2024));
        System.out.println(tasknine(1800));
        System.out.println(tasknine(2022));
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0};
        System.out.print("Исходный массив: ");
        printArray(arr);
        taskten(arr);
        System.out.print("Измененный массив: ");
        printArray(arr);
        int[] numbers = new int[100];
        taskeleven(numbers);
        System.out.print("Первые 10 элементов: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        tasktwelve(number);
        System.out.println();
        System.out.print("Измененный массив: ");
        printArray(number);
        int size = 5;
        int[][] matrix = new int[size][size];
        taskthirteen(matrix);
        printMatrix(matrix);
        int[] array1 = taskfourteen(5, 10);
        int[] array2 = taskfourteen(3, -1);
        System.out.println("Первый массив:");
        printArray(array1);
        System.out.println("\nВторой массив:");
        printArray(array2);


    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 6;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean taskfive(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        return false;
    }

    public static void tasksix(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean taskseven(int number) {
        if (number >= 0) return false;
        return true;
    }

    public static void taskeight(String text, int times) {
        int i = 0;
        while (i < times) {
            System.out.println(text);
            i++;

        }
    }

    public static boolean tasknine(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }

    public static void taskten(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void taskeleven(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

    }

    public static void tasktwelve(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) {
                number[i] *= 2;
            }
        }

    }

    public static void taskthirteen(int[][]matrix) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    public static int[] taskfourteen(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;

    }
}
