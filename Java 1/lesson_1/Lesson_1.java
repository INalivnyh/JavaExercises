package level_1.lesson1;

/**
 * GeekBrains. Java. Level 1. Lesson 1. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 11.08.2018
 */

public class Lesson_1 {
    public static void main(String... args) {

        //Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte aByte = 127;
        short aShort = 32767;
        int aInt = 2147483647;
        long aLong = 9223372036854775807L;
        float aFloat = 120.0f;
        double aDouble = 1.2;
        char aChar = 'a';
        boolean aBoolean = false;
        String name = "Igor";

        int a = 2;
        int b = 4;
        int c = 6;
        int d = 1;

        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – входные параметры этого метода;
        System.out.println(calculate(a, b, c, d));

        //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
        //пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println(sum1(c, d));

        //Написать метод, которому в качестве параметра передается целое число, метод должен
        //напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
        //ноль считаем положительным числом.
        isPositiveOrNegative(-10);

        //Написать метод, которому в качестве параметра передается целое число, метод должен
        //вернуть true, если число отрицательное;
        System.out.println(check2(10));

        //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        greetings(name);
    }

    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean sum1(int c, int d) {
        int sum = c + d;
        if (sum > 10 && sum <= 20)
            return true;
        return false;
    }

    private static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("число a " + a + " положительное");
        } else {
            System.out.println("число a " + a + " отрицательное");
        }
    }

    private static boolean check2(int a) {
        if (a < 0)
            return true;
        return false;
    }

    private static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }
}