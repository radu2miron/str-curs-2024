package edu.tucn.str.ex5collections.ex2set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(5);

        set.forEach(System.out::println);
    }
}
