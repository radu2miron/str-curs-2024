package edu.tucn.str.lecture4.ex2concurrentmodifexc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Radu Miron
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("des");
        list.add("e");
        list.add("des");

        for (String s : list) {
            if (s.equals("des")) {
                list.remove(s);
            }
        }

        // todo: show iterator

        System.out.println(list.size());
    }
}
