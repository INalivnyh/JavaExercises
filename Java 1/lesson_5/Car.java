package lesson_5;

/**
 * GeekBrains. Java. Level 1. Lesson NUM. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 24.08.2018
 */

public class Car {
    String name;
    String color;

    public void printInfo(){
        System.out.println("name: "+name+ ", color: " + color);
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String name) {
        this(name, "qew");

    }

    public Car() {
        name ="def";
        color="black";
    }
}
