package ua.ithillel.lesson2.part3;

public class Figure implements Area {

    double a;
    double b;

    public Figure(double a, double b) {
       this.a = a;
       this.b = b;
    }

    @Override
    public double calcSquare(double a, double b) {
        return a * b;
    }


}

