package ua.ithillel.lesson2.part2;

public class Animal {

    private final String run;
    private final String swim;
    private final String name;


    public Animal(String run, String swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
    }



    public void actionRun () {
        System.out.println(this.name + " ran " + this.run);
    }
    
    public void actionSwim() {
        System.out.println(this.name + " swam " + this.swim);
    }
}
