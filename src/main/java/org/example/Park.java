package org.example;

import java.time.LocalTime;

public class Park {
    public class Attraction {
        private String name;
        private LocalTime openingTime;
        private LocalTime closingTime;
        private double price;

        public Attraction(String name, LocalTime openingTime, LocalTime closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return openingTime + " - " + closingTime;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " (Работает: " + getWorkingHours() + ", Цена: " + price + " руб.)";
        }
    }

    public static void main(String[] args) {

    }
}

