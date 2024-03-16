package edu.tucn.str.lecture2.ex2runnable;

/**
 * @author Radu Miron
 * @version 1
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " wrote message " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
