package ua.ithillel.lesson2.part2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void actionRun(double distance) {
        if (distance < 500) {
            System.out.println("Собака " + super.name + " пробіг " + distance + " м");
        } else {
            System.out.println("Собака " + super.name + " не біжить");
        }
    }

    @Override
    public void actionSwim(double distance) {
        if (distance < 10) {
            System.out.println("Собака " + super.name + " проплив " + distance + " м");
        } else {
            System.out.println("Собака " + super.name + " не пливе");
        }
    }
}
