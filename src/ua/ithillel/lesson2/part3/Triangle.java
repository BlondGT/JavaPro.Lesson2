package ua.ithillel.lesson2.part3;

public class Triangle implements Figure {

    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calcArea() {

        return base * height / 2;
    }
}
