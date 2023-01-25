package ua.ithillel.lesson2.part3;

public class Square extends Figure implements Area{

    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcSquare(double a, double b) {
        return a * b;
    }
}
