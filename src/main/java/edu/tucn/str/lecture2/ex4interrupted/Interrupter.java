package edu.tucn.str.lecture2.ex4interrupted;

/**
 * @author Radu Miron
 * @version 1
 */
public class Interrupter extends Thread{
    private SlowExec slowExec; //...constructor association

    public Interrupter(SlowExec slowExec) {
        this.slowExec = slowExec;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000); // 5 sec
        } catch (InterruptedException e) {}

        slowExec.interrupt();
    }
}
