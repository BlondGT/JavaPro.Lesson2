package ua.ithillel.lesson2.part1;

public class Start {

    public static void main(String[] args) {

        var car = new Car();

        car.startCommand();
        car.startElectricity();
        car.startFuelSystem();
    }
}
