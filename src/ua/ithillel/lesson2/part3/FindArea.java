package ua.ithillel.lesson2.part3;

public class FindArea {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(10);
        figures[1] = new Square(10,10);
        figures[2] = new Triangle(10, 10);
        double sum = 0;


        for (Figure figure : figures) {
            sum = sum + figure.calcArea();
        }
        System.out.printf("The sum of the array elements is %.2f", sum);
    }
}
