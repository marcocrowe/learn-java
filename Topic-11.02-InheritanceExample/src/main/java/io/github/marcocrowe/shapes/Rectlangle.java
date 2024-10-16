package io.github.marcocrowe.shapes;

public class Rectlangle extends TwoDimensionalShape {

    private double length;
    private double width;

    public Rectlangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getAreaa() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectlangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
