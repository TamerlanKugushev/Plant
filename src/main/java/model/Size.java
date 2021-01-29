package model;

import java.util.Objects;

public class Size {
    private double length;
    private double height;
    private double perimeter;

    public Size() {
    }

    public Size(double length, double height) {
        this.length = length;
        this.height = height;
        this.setPerimeter();
    }

    public Size(Size size) {
        this.length = size.length;
        this.height = size.height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.setPerimeter();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.setPerimeter();
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter() {
        this.perimeter = this.length + this.height;
    }

    @Override
    public String toString() {
        return "Size{" +
                "length=" + length +
                ", height=" + height +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Double.compare(size.length, length) == 0 &&
                Double.compare(size.height, height) == 0 &&
                Double.compare(size.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height, perimeter);
    }
}
