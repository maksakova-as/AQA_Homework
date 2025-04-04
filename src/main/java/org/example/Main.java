import org.example.exceptions.MyArrayDataException;
import org.example.exceptions.MyArraySizeException;


public class Main {

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2"},
                {"3", "4"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "hello", "12"},
                {"13", "14", "15", "16"}
        };


        testArray(correctArray);
        testArray(wrongSizeArray);
        testArray(wrongDataArray);

        try {
            System.out.println(correctArray[10][10]); // Выход за границы
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nПоймали ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }


    private static void testArray(String[][] array) {
        System.out.println("\nТестируем массив:");
        try {
            System.out.println("Сумма: " + sumArray(array));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}