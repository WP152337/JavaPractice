package org.dimigo.oop;

/**
 * Created by 12bra on 2017-03-23.
 */
public class Car3 {
    private String company;
    private String model ;
    private String color ;
    private int maxSpeed;
    private int price ;

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car3(String Company, String Model, String Color, int MaxSpeed) {
        this(Company,Model,Color,MaxSpeed,0);
    }
    public Car3(String Company, String Model, String Color) {
        this(Company, Model,Color,0);
    }

    public String getCompany() {

        return company;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor() {

        return color;
    }
    public int getMaxSpeed() {

        return maxSpeed;
    }
    public int getPrice()
    {
        return price;
    }



}
