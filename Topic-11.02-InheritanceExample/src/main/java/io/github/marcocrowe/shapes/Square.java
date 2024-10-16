package io.github.marcocrowe.shapes;

public class Square extends TwoDimensionalShape {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getAreaa() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
