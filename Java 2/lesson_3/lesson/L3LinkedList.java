package hw3.lesson;

import java.util.LinkedList;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 29.09.2018
 */

public class L3LinkedList {
    public static void main(String[] args) {
        LinkedList<String> w = new LinkedList<String>();
        w.add("F");
        w.add("B");
        w.add("D");
        w.add("E");
        w.add("C");
        w.addLast("Z");
        w.addFirst("A");

        w.add(1,"A2");
        System.out.println(w);
        w.remove("F");
        w.remove(2);
        System.out.println(w);
        w.removeFirst();
        w.removeLast();
        System.out.println(w);


        String val= w.get(2);
        w.set(2, val + " изменено");
        System.out.println(w);

    }


}
