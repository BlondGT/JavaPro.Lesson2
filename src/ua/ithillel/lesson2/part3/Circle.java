package ua.ithillel.lesson2.part3;

public class Circle extends Figure implements Area {


    public Circle(double a, double b) {
        super(a, b);
    }

    @Override
    public double calcSquare(double a, double b) {
        return (Math.PI * a * a);
    }

}
