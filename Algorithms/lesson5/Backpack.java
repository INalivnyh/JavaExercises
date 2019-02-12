/**
 * GeekBrains. Java. Algorithms. Lesson 5. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 12.02.2019
 */

/*
 * 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.*/

class Goods {
    private int weight;
    private int value;

    public Goods(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}


public class Backpack {
    static final int MAX_WEIGHT = 80;

    static Goods[] goods = {
            new Goods(15, 30),
            new Goods(30, 90),
            new Goods(50, 100)
    };

    public static void main(String[] args) {
        System.out.println(findBestRes(goods.length - 1, MAX_WEIGHT));
    }

    private static int findBestRes(int i, int weigth) {
        if (i < 0) {
            return 0;
        }
        if (goods[i].getWeight() > weigth) {
            return findBestRes(i - 1, weigth);
        } else {
            return Math.max(findBestRes(i - 1, weigth), findBestRes(i - 1, weigth - goods[i].getWeight()) + goods[i].getValue()); // ???
        }
    }
}