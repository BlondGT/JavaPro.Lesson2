package ua.ithillel.lesson2.part1.employee2;

import ua.ithillel.lesson2.part1.Employee;

public class SameName {

    static String name;
    static String position;
    static String email;
    static String phone;
    static int age;
    static Employee employee;

    public static void main(String[] args) {

        name = "Alice";
        position = "Manager";
        email = "alice@gmail.com";
        phone = "0987654";
        age = 25;

        employee = new Employee(name, position, email, phone, age);

        System.out.println(
                employee.name + " " +
                        employee.position + " " +
                        employee.email + " " +
                        employee.phone + " " +
                        employee.age
        );

    }

}
