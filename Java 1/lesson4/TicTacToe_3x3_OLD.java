/**
 * GeekBrains. Java. Level 1. Lesson 4.
 *
 * @author Igor
 * @version 24.08.2018
 */

package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe_3x3_OLD {
    private static final int SIZE = 3;
    private static final char DOT_X = 'x'; //поле хранит символ Х
    private static final char DOT_O = 'o'; //поле хранит символ О
    private static final char DOT_EMPTY = '*'; //пустое поле
    private static char[][] map = new char[SIZE][SIZE]; //игровое поле
    private static Scanner sc = new Scanner(System.in); //Scanner для чтения с консоли
    private static Random rand = new Random(); //генератор случайных чисел

    public static void initPam() { //инициализируем массив map (игровое поле)
        for (int i = 0; i < SIZE; i++) { //двойным массивом проходимся по всему массиву
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = '*'; //и заполняем каждую ячейку *
            }
        }
    }

    public static void printMap() { //выводим игровое поле в консоль
        System.out.println("0 1 2 3"); //первая строка с координатами
        for (int i = 0; i < 3; i++) { //начинаем печатать поле
            System.out.print((i + 1) + " "); //ставим номер строки 1-3
            for (int j = 0; j < 3; j++) { //начинаем печатать строку
                System.out.print(map[i][j] + " "); //посимвольно печатаем содержмимое
            }
            System.out.println(); //после распечатки строки, делаем перевод коретки
        }
        System.out.println(); //делаем дополнительный перевод строки
    }

    public static void main(String[] args) {
        initPam();//инициализируем поле
        printMap();//печатаем в консоль
        while (true) { //запускаем игровой цикл
            humanTurn(); //ход человека
            printMap(); //печать поля
            if (checkWin1('X')) { //проверка победы человека
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break;//если поле заполнилось, завершить игру
            aiTurn(); //ход компьютера
            printMap(); //печать поля
            if (checkWin1('O')) { //проверка победы компьютера
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("GAME OVER");
    }
   private static boolean checkWin1(char ox) { //Проверяем победу
        // check horizontals
        if (map[0][0] == ox && map[0][1] == ox && map[0][2] == ox) return true;
        if (map[1][0] == ox && map[1][1] == ox && map[1][2] == ox) return true;
        if (map[2][0] == ox && map[2][1] == ox && map[2][2] == ox) return true;
        // check verticals
        if (map[0][0] == ox && map[1][0] == ox && map[2][0] == ox) return true;
        if (map[0][1] == ox && map[1][1] == ox && map[2][1] == ox) return true;
        if (map[0][2] == ox && map[1][2] == ox && map[2][2] == ox) return true;
        // check diagonals
        if (map[0][0] == ox && map[1][1] == ox && map[2][2] == ox) return true;
        if (map[2][0] == ox && map[1][1] == ox && map[0][2] == ox) return true;
        return false;
    }

    private static void humanTurn() { //Ход человека
        int x, y;
        do {
            System.out.println("Введите координатв в формате Х и У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y)); //пользователь вводит координаты до тех пор,
        map[y][x] = DOT_X; //После чего ставим туда Х
    }
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {  //Компьютер пытается случайно выбрать незанятое поле для хода
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_O; //Как только найдена, ставим туда 0
    }

    private static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}





