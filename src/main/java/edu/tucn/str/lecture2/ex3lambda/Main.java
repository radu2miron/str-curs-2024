package edu.tucn.str.lecture2.ex3lambda;

import java.util.Arrays;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        new Thread(() -> doPrint()).start();
        new Thread(Main::doPrint).start(); // identical with the first line
        doPrint();
    }

    public static void doPrint() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " wrote message " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    //THIS HAS NOTHING TO DO WITH THREADS! IT'S ABOUT LAMBDAS!
    public static String unrelatedLambdaExample() {
        return Arrays.asList("Tavi", "Maria", "Teo", "Mirces").stream()
                .filter(s -> s.startsWith("T"))
                .map(s -> s.toUpperCase())
                .reduce((s1, s2) -> s1 + "_" + s2)
                .orElse("");

    }
}
