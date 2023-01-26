package ua.ithillel.lesson2.part3;

public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

}
