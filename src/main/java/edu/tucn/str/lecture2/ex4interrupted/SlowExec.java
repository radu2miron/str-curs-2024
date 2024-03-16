package edu.tucn.str.lecture2.ex4interrupted;

/**
 * @author Radu Miron
 * @version 1
 */
class SlowExec extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000 * 60 * 60 * 24); // 1 day
        } catch (InterruptedException e) {
            System.err.println("I've been interrupted");
        }

        // refresh BNR exchange rates
    }
}
