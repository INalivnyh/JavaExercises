package hw3.lesson;

import java.util.ArrayList;

/**
 * GeekBrains. Java. Level 2. Lesson 3. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 29.09.2018
 */

public class Lesson3H {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add(1,"A0");
        System.out.println(al);

        al.remove("e");
        System.out.println(al);
        al.remove(2);
        System.out.println(al);

    }
}
