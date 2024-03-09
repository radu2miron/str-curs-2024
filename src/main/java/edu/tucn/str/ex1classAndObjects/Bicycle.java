package edu.tucn.str.ex1classAndObjects;

/**
 * @author Radu Miron
 * @version 1
 */
public class Bicycle {
    private static int counter = 0;
    private BicycleType bicycleType;
    private int gears;
    private String color;

    public Bicycle(BicycleType bicycleType, int gears, String color) {
        this.bicycleType = bicycleType;
        this.gears = gears;
        this.color = color;
        counter++;
    }

    public void bend() {
        System.out.printf("The %s bike bends\n", this.color);
    }

    public void doBreak() {
        System.out.printf("The %s breaks\n", this.bicycleType);
    }

    public void doAccident(Bicycle other) {
        System.out.printf("The %s bike bumps into %s bike\n", this.color, other.color);
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "bicycleType=" + bicycleType +
                ", gears=" + gears +
                ", color='" + color + '\'' +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
