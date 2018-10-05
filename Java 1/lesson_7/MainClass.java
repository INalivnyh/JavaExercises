/**
 * GeekBrains. Java. Level 1. Lesson ???.
 *
 * @author Igor
 * @version 30.08.2018
 */

package lesson_7;

public class MainClass {
    public static void main(String[] args) {
        String someText = "Simple Java programm - Hello World";

        String[] someTextTokens = someText.split(" ");
        for (int i = 0; i < someTextTokens.length; i++) {
            System.out.println(someTextTokens[i]);
        }
        System.out.println();

        System.out.println(someText.length());
        System.out.println(someText.contains("Hello"));
        System.out.println(someText.charAt(5));
        System.out.println(someText.endsWith("World"));
        System.out.println(someText.startsWith("Simple"));
        System.out.println(someText.indexOf("p"));
        System.out.println(someText.isEmpty());
        System.out.println(someText.concat(" + concat"));
        System.out.println(someText.replace(" ","_"));
        System.out.println(someText.toLowerCase());
        System.out.println(someText.toUpperCase());
        System.out.println(someText.substring(3,7));

    }
}
