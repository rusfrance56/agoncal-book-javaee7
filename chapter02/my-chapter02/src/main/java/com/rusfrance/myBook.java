package com.rusfrance;

public class myBook {

    private String name;
    private String description;
    private String number;
    private Float price;

    public myBook() {
    }

    public myBook(String name, String description, Float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "myBook{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number='" + number + '\'' +
                ", price=" + price +
                '}';
    }
}
