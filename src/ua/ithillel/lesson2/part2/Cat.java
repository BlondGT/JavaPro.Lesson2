package ua.ithillel.lesson2.part2;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void actionRun(double distance) {
        if (distance < 200) {
            System.out.println("Кіт " + super.name + " пробіг " + distance + " м");
        } else {
            System.out.println("Кіт " + super.name + " не біжить");
        }
    }

    @Override
    public void actionSwim(double distance) {
        System.out.println("Кіт " + super.name + " не плаває");
    }


}



