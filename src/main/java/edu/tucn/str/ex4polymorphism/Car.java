package edu.tucn.str.ex4polymorphism;

/**
 * @author Radu Miron
 * @version 1
 */
public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void start() {
        System.out.printf("%s starts\n", name);
    }

    public void go() {
        System.out.printf("%s goes\n", name);
    }

    public void stop() {
        System.out.printf("%s stops\n", name);
    }
}
