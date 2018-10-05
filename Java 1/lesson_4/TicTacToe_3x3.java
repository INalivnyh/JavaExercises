package lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * GeekBrains. Java. Level 1. Lesson 4.
 *
 * @author Igor Nalivnyh
 * @version 20.08.2018
 */

class TicTacToe_3x3 {

    final int SIZE = 3;
    final char DOT_X = 'x'; //поле хранит символ Х
    final char DOT_O = 'o'; //поле хранит символ О
    final char DOT_EMPTY = '.'; //пустое поле
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    TicTacToe_3x3() {
        initMap(); //инициализация поля
        while (true) { //бесконечный игровой цыкл
            humanTurn(); //человек сделал ход
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!"); //ты победил
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!"); //заполнено все поле, ничья
                break;
            }

            aiTurn(); //ход компьютера
            printMap(); //вывод в консоль содержимого игрового поля
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!"); //компьютер победил
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!"); //все поле заполненно, ничья
                break;
            }
        }
        System.out.println("GAME OVER");
        printMap();
    }

    public static void main(String[] args) {
        new TicTacToe_3x3();
    }

    void initMap() { //иницыализация игрового массива
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {
        // check horizontals
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) return true;
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) return true;
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) return true;
        // check verticals
        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) return true;
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) return true;
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) return true;
        // check diagonals
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) return true;
        if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) return true;
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}





