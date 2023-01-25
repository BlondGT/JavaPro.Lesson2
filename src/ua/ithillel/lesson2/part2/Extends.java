package ua.ithillel.lesson2.part2;

public class Extends {

    static String name;
    static String run;
    static String swim;

    public static void main(String[] args) {

        getInfoCat();
        getInfoDog();
    }

    private static void getInfoCat() {
        name = "Murka";
        run = "200m";
        swim = "0m";
        Cat cat = new Cat(run, swim, name);
        cat.actionRun();
        cat.actionSwim();
    }

    private static void getInfoDog() {
        name = "Bobik";
        run = "500m";
        swim = "10m";
        Dog dog = new Dog (run, swim, name);
        dog.actionRun();
        dog.actionSwim();
    }
}
