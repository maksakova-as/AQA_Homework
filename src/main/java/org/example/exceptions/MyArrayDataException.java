package org.example.exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в ячейке [%d][%d] - должно быть число!", row, col));
    }
}