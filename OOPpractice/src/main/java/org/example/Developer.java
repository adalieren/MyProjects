package org.example;

public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 2056.32;
    }
}
