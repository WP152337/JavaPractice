package org.dimigo.oop;

/**
 * Created by 12bra on 2017-03-23.
 */
public class Car {
    private String company = "현대자동차";
    private String model = "제네시스";
    private String color = "'검정색";
    private int maxSpeed=225;
    private int price = 50000000;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
