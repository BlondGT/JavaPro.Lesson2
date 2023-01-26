package ua.ithillel.lesson2.part2;

public abstract class Animal {

    final String name;

    public Animal(String name) {
        this.name = name;
    }


    public abstract void actionRun(double distance);

    public abstract void actionSwim(double distance);
}
