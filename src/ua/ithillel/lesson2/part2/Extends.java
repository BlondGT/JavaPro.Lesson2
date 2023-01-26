package ua.ithillel.lesson2.part2;

public class Extends {

    static String name;
    static double distanceRun;
    static double distanceSwim;

    public static void main(String[] args) {

        getInfoCat();
        getInfoDog();
    }

    private static void getInfoCat() {
        name = "Мурка";
        Cat cat = new Cat(name);
        distanceRun = 50;
        cat.actionRun(distanceRun);
        distanceSwim = 100;
        cat.actionSwim(distanceSwim);
    }

    private static void getInfoDog() {
        name = "Бобік";
        Dog dog = new Dog(name);
        distanceRun = 100;
        dog.actionRun(distanceRun);
        distanceSwim = 5;
        dog.actionSwim(distanceSwim);
    }
}
