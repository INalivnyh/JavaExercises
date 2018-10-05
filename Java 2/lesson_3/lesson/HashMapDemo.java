package hw3.lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * GeekBrains. Java. Level 2. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 29.09.2018
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Jon Dou", new Double(3434.32));
        hm.put("Jein Baiker", new Double(1378.00));
        hm.put("Tom Holl", new Double(99.22));
        hm.put("Ralf Smit", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

            double balance = hm.get("Jon Dou");
            hm.put("Jon Dou", balance+1000);
            System.out.println(hm.get("Jon Dou"));
        }
    }
