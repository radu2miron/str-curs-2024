package edu.tucn.str.lecture2.ex1thread;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // threads should not be started with run()!!!
//        thread1.run();
//        thread2.run();

        thread1.start();
        thread2.start();
        thread1.run(); // this is executed by the main thread!
    }
}
