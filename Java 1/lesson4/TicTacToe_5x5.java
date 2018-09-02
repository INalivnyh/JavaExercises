/**
 * GeekBrains. Java. Level 1. Lesson 4.
 *
 * @author Igor Nalivnyh
 * @version 24.08.2018
 */


import java.util.Random;
import java.util.Scanner;


class TicTacToe_5x5 {

    final int SIZE = 5; //размер поля
    final char DOT_X = 'x'; //игрок
    final char DOT_O = 'o'; //ИИ
    final char DOT_EMPTY = '.'; //пустая ячейка
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe_5x5().go();
    }

    void go() { //запуск игры
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("SORRY, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
    }

    void initMap() { //инициализируем массив map
        for (int i = 0; i < SIZE; i++) { //двойным циклом проходимся по всему массиву
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; //и заполняем каждую ячейку *
            }
        }
    }

    void humanTurn() { //ход человека
        int x, y;
        do {
            System.out.println("Enter X and Y (1-5):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() { //ход ИИ
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    void printMap() { //вывод поля в консоль

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " "); //печать поля по горизонтали
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1+" "); //печать поля по вертикали
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean checkWin(char dot) { //проверка победы
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    hor++;
                }
                if (map[j][i] == dot) {
                    ver++;
                }
            }
            if (hor == SIZE || ver == SIZE) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == dot) {
                diag2++;
            }
        }
        if (diag1 == SIZE || diag2 == SIZE) {
            return true; //проверка по диагоналям
        }
        return false;
    }

    boolean isMapFull() { //проверка на заполненность поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    boolean isCellValid(int x, int y) { //поиск свободной ячейки
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
}

