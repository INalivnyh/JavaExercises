package lesson_5;

/**
 * GeekBrains. Java. Level 1. Lesson 5.
 *
 * @author Igor
 * @version 25.08.2018
 */

public class Lesson5 {
    public static void main(String[] args) {
        Cat cat = new Cat("murzik","white",9);
        cat.setAge(-1900);
        System.out.println(cat.name+" " + cat.color + " "+cat.getAge()+" " + cat.voice());
    }

}
class Cat{
    String name;
    String color;
    private int age;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        setAge(age);
    }
    void setAge(int age){
        if (age>0)
            this.age=age;
    }

    int getAge(){
        return age;
    }

    String voice(){
        return "meaw";
    }


}
