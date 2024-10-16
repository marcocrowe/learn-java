package io.github.marcocrowe.shapes;

public class Application {

    public static void main(String[] args) {

        TwoDimensionalShape shape1 = new Rectlangle(5, 8);

        System.out.println("Area of shape1: " + shape1.getArea());
        System.out.println("Perimeter of shape1: " + shape1.getPerimeter());

        var square = (Rectlangle) shape1;
        System.out.println("Side Length of shape1: " + square.getLength());

        Object o = new Rectlangle(5, 8);

        System.out.println("Object o: " + o);
    }
}
