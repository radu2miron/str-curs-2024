package edu.tucn.str.ex4polymorphism;

/**
 * @author Radu Miron
 * @version 1
 */
public class BMW extends Car {
    public BMW(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("BMW goes faster");
    }
}
