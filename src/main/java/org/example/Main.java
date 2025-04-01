package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        product productOne = new product("Смартфон Apple iPhone 13",
                "10.10.2021", " Apple", " China",
                80000, true);
        productOne.getInfo();

        product[] productsArray = new product[5];

        productsArray[0] = new product("Samsung s25 Ultra.", "01.02.2025",
                "Samsung Corp.", "Korea.", 5599, true);
        productsArray[1] = new product("iPhone 16 Pro.", "15.09.2024",
                "Apple Inc.", "USA.", 6499, false);
        productsArray[2] = new product("Xiaomi 14.", "10.11.2023",
                "Xiaomi.", "China.", 3999, true);
        productsArray[3] = new product("Pixel 8 Pro.", "05.10.2023",
                "Google.", "USA.", 4999, false);
        productsArray[4] = new product("Galaxy Z Fold6.", "01.08.2024",
                "Samsung Corp.", "Korea.", 4599, true);

        System.out.println("Список товаров:");
        for (product product : productsArray) {
            product.getInfo();

        }

        Park park = new Park();

        Park.Attraction carousel = park.new Attraction("Карусель",
                LocalTime.of(10, 0), LocalTime.of(20, 0), 250);

        Park.Attraction rollerCoaster = park.new Attraction("Американские горки",
                LocalTime.of(11, 0), LocalTime.of(22, 0), 500);

        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения",
                LocalTime.of(9, 30), LocalTime.of(21, 30), 350);

        System.out.println("Аттракционы в парке:");
        System.out.println("1. " + carousel);
        System.out.println("2. " + rollerCoaster);
        System.out.println("3. " + ferrisWheel);
    }

}
