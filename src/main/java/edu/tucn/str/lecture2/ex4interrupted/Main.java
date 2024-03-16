package edu.tucn.str.lecture2.ex4interrupted;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        SlowExec slowExec = new SlowExec();
        Interrupter interrupter = new Interrupter(slowExec);

        slowExec.start();
        interrupter.start();
    }
}
