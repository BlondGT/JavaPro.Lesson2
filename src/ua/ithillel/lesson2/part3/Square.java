package ua.ithillel.lesson2.part3;

public class Square implements Figure {

    private final double side1;
    private final double side2;

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calcArea() {

        return side1 * side2;
    }
}
