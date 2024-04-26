package edu.tucn.str.lecture5.ex5virtualthreads.ex2creation;

import edu.tucn.str.lecture5.ex5virtualthreads.util.Utils;

/**
 * @author Radu Miron
 * @version 1
 */
public class Ex2CreateVT {
    public static void main(String[] args) throws InterruptedException {
        // create and start create 2 virtual threads
        Thread vt1 = Thread.ofVirtual()
                           .name("Ioan")
                           .start(() -> Utils.print10Messages());
        Thread vt2 = Thread.ofVirtual()
                           .name("Gheorghe")
                           .start(Utils::print10Messages);
        Thread vt3 = Thread.ofVirtual()
                           .name("Vasile")
                           .start(Utils::print10Messages);

        // join threads
        vt1.join();
        vt2.join();
        vt3.join();
    }
}
