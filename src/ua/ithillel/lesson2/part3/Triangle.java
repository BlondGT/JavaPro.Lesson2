package ua.ithillel.lesson2.part3;

public class Triangle extends Figure implements Area {

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcSquare(double a, double b) {
        return (a * b / 2);
    }
}
