package edu.tucn.str.lecture2.ex2runnable;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
