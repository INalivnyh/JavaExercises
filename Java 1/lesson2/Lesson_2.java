package level_1.lesson2;

import java.util.Arrays;

/**
 * GeekBrains. Java. Level 1. Lesson 2. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 14.08.2018
 */


public class Lesson_2 {
    public static void main(String[] args) {

        // simple task (1...4)
        System.out.println(Arrays.toString(invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));
        System.out.println(Arrays.toString(fillArray(new int[8])));
        System.out.println(Arrays.toString(changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        fillDiagonal(5);

        // tasks of increased complexity (5...7)
        // find min and max (5)
        System.out.println(Arrays.toString(findMinMax(new int[]{1, 5, 3, 2, 11, 3, 5, 2, 4, 8})));

        // check balance (6)
        int[][] test = {{1, 1, 1, 2, 1}, {2, 1, 1, 2, 1}, {10, 10}};
        for (int i = 0; i < test.length; i++) {
            System.out.println(Arrays.toString(test[i]) + " " + checkBalance(test[i]));
        }

        // shift array (7)
        System.out.println(Arrays.toString(shiftArray(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(shiftArray(new int[]{1, 2, 3, 4, 5}, -1)));

        // console calculator (extra)
        //calcConsole();
    }


    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    private static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        return arr;
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
     * значениями 0 3 6 9 12 15 18 21;
     */

    private static int[] fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = i * 3;
        }
        return list;
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
     * умножить на 2;
     */

    private static int[] changeArray(int[] list2) {
        int temp;
        for (int i = 0; i < list2.length; i++) {
            temp = list2[i];
            list2[i] = temp < 6 ? temp * 2 : temp;
        }
        return list2;
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
     * одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    private static void fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        //System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    /**
     * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
     * помощи интернета);
     */

    private static int[] findMinMax(int[] array) {
        int[] minMax = new int[2];
        minMax[0] = minMax[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minMax[0] > array[i])
                minMax[0] = array[i];
            if (minMax[1] < array[i])
                minMax[1] = array[i];
        }
        return minMax;
    }

    /*6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
входят.*/
    private static boolean checkBalance(int[] array) {
        if (array == null || array.length < 2)
            return false;
        int sumArray = 0, sumLeft = 0;
        for (int i : array)
            sumArray += i;
        if ((sumArray == 0) && (sumArray % 2 != 0))
            return false;
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft += array[i];
            if (sumLeft * 2 == sumArray)
                return true;
        }
        return false;
    }

/*
7 **** Написать метод, которому на вход подаётся одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы
массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
массивами.
*/

    private static int[] shiftArray(int[] array, int shift) {
        if (array == null || array.length < 2 || shift == 0 || shift % array.length == 0)
            return array;
        shift = shift % array.length;
        if (shift < 0)
            shift += array.length;
        for (int cnt = 0; cnt < shift; cnt++) {
            int tmp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = tmp;
        }
        return array;
    }
}




