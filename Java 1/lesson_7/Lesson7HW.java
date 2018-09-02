package lesson_7;

/**
 * GeekBrains. Java. Level 1. Lesson 7. HomeWork
 *
 * @author Igor Nalivnyh
 * @version 02.09.2018
 */

/**
* 1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
*/

public class Lesson7HW {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 30),
                new Cat("Shelbi", 20)};
        Plate plate = new Plate(60);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat + " " + cat.info());
        }
        System.out.println(plate);
        System.out.println("Увеличить пищу на 100");
        plate.addFood(100);
        System.out.println(plate);
        System.out.println("Кошки берут еду:");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}


class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    void addFood(int amount) {
        this.food += amount;
    }

    @Override
    public String toString() {
        return "PLATE: " + food;
    }


}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }


    String info() {
        String isHungry = isFull ? "СЫТ" : "ГОЛОДЕН";
        return isHungry;
    }

    void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

    @Override
    public String toString() {
        return name + " APPETITE: " + appetite;


    }

}


