/**
 * GeekBrains. Java. Level 1. Lesson 6.
 *
 * @author Igor Nalivnyh
 * @version 29.08.2018
 */

package level_1.lesson_6;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 * В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
 * или высоту (для прыжков).
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
 * плавание: кот не умеет плавать, собака 10 м.).
 * 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 * (Например, dog1.run(150); -> результат: run: true)
 * 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

public class Lesson6HW {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Murka", 200, 0, 2),
                            new Dog("Tobik", 500, 10, 0.5),
                            new Dog("Bobik", 300, 0, 5)};

        for (Animal animal : animals) {
//            System.out.println(animal + "  Run: " + animal.run(300) + "\n" + "      " +
//                                        "Swim: " + animal.swim(10) + "\n" + "      " +
//                                        "Jump: " + animal.jump(2) + "\n");

            System.out.println(animal.getClass().getName() + "\n" + "       Run: " + animal.run(300) + "\n" + "      " +
                    "Swim: " + animal.swim(10) + "\n" + "      " +
                    "Jump: " + animal.jump(2) + "\n");
        }
    }
}

class Dog extends Animal {
    private String nameAnimal;

    public Dog(String nameAnimal, int runMaxDistance, int swimMaxDistance, double jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
        this.nameAnimal = nameAnimal;
    }

    @Override
    public boolean run(int runDistance) {
        return runDistance <= getRunMaxDistance();
    }

    @Override
    public boolean swim(int swimDistance) {
        return swimDistance <= getSwimMaxDistance();
    }

    @Override
    public boolean jump(double jumpHeight) {
        return jumpHeight <= getJumpMaxDistance();
    }

    public String toString() {
        return nameAnimal;
    }
}

class Cat extends Animal {
    private String nameAnimal;

    public Cat(String nameAnimal, int runMaxDistance, int swimMaxDistance, double jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
        this.nameAnimal = nameAnimal;
    }

    @Override
    public boolean run(int runDistance) {
        return runDistance <= getRunMaxDistance();
    }

    @Override
    public boolean swim(int swimDistance) {
        return swimDistance <= getSwimMaxDistance();
    }

    @Override
    public boolean jump(double jumpHeight) {
        return jumpHeight <= getJumpMaxDistance();
    }

    public String toString() {
        return nameAnimal;
    }
}

abstract class Animal {
    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания
    private double jumpMaxDistance; // Дистанция прыжка

    public int getRunMaxDistance() {
        return runMaxDistance;
    }

    public int getSwimMaxDistance() {
        return swimMaxDistance;
    }

    public double getJumpMaxDistance() {
        return jumpMaxDistance;
    }

    public Animal(int runMaxDistance, int swimMaxDistance, double jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    public abstract boolean run(int runDistance);  // Бегать
    public abstract boolean swim(int swimDistance);  // Плыть
    public abstract boolean jump(double jumpHeight);  // Прыгать
    }
