/*
package lesson_6;

class J1Lesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Murzik", " white", 3),
                             new Dog("Sharik", " black", 5)};
        for (IAnimal animal : animals)
            System.out.println(animal + " says " + animal.voice());
    }
}

class Cat extends Animal {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public String voice() {
        return "meow";
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public String voice() {
        return "gaf-gaf";
    }
}

interface IAnimal {
    abstract String voice();
}

abstract class Animal implements IAnimal {
    String name;
    String color;
    static int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}*/
