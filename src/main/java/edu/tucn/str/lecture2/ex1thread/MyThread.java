package edu.tucn.str.lecture2.ex1thread;

/**
 * @author Radu Miron
 * @version 1
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        this.setName(name);
    }

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
