package model;

import java.util.Objects;

public class Plant {
    private String name;
    private String color;
    private int numberOfStems;
    private int lifeTime;
    private double marketPrice;
    private Size size;


    public Plant() {
        this.name = "";
        this.color = "";
        this.size = new Size();
    }

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
        this.size = new Size();
    }

    public Plant(String name, String color, int numberOfStems, int lifeTime, double marketPrice,
                 double length, double height) {
        this(name, color);
        this.numberOfStems = numberOfStems;
        this.lifeTime = lifeTime;
        this.marketPrice = marketPrice;
        this.size = new Size(length, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfStems() {
        return numberOfStems;
    }

    public void setNumberOfStems(int numberOfStems) {
        this.numberOfStems = numberOfStems;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Size getSize() {
        return new Size(this.size);
    }

    public void incrementNumberOfStems(int count) {
        this.numberOfStems += count;
    }

    public void incrementLifeTime(int count) {
        this.lifeTime += count;
    }

    public void incrementMarkerPrice(double count) {
        this.marketPrice += count;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return numberOfStems == plant.numberOfStems &&
                lifeTime == plant.lifeTime &&
                marketPrice == plant.marketPrice &&
                name.equals(plant.name) &&
                color.equals(plant.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, numberOfStems, lifeTime, marketPrice);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfStems=" + numberOfStems +
                ", lifeTime=" + lifeTime +
                ", marketPrice=" + marketPrice +
                '}';
    }
}
