package org.example;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    @Override
    double calculateSalary() {
        return 1500.44 ;
    }
}
