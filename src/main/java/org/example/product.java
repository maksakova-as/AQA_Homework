package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class product {
    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean status;

    product(String name, String productionDateStr, String manufacturer, String country, int price,
            boolean status) {
        this.status = status;
        this.price = price;
        this.country = country;
        this.manufacturer = manufacturer;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.productionDate = LocalDate.parse(productionDateStr, formatter);
        this.name = name;

    }

    public void getInfo() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("name = " + name + " productionDate = " + productionDate +
                " manufacturer = " + manufacturer + " country = " + country + " price = " + price +
                " status = " + status);

    }


}