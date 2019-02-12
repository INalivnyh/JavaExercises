/**
 * GeekBrains. Java. Algorithms. Lesson 5. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 12.02.2019
 */

/*1. Написать программу по возведению числа в степень с помощью рекурсии.*/

public class HWLesson5 {
    public static void main(String[] args) {
        System.out.println(pow(8,9));

    }
    public static int pow(int a, int e) {
        if (e == 0) {
            return 1;
        }
        int t = pow(a, e / 2);
        return (e % 2 != 0 ? a : 1) * t * t;
    }
}







