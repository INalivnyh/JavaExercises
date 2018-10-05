/**
 * GeekBrains. Java. Level 1. Lesson 5.
 *
 * @author Igor Nalivnyh
 * @version 25.08.2018
 */

package lesson_5;

/*
* * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/

public class Lesson_5HW {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Иванов Иван Иванович", "Инженер 1", "test0@mail.ru", "780980809", 5000, 30);
        person[1] = new Person("Васильев Василий Васильевич", "Инженер 2", "test1@mail.ru", "768686868", 10000, 40);
        person[2] = new Person("Петров Петр Петрович Иван Иванович", "Инженер 3", "test2@mail.ru", "242424244", 20000, 45);
        person[3] = new Person("Пупкин Пупок Пупковович", "Инженер 4", "test3@mail.ru", "098080098", 30000, 50);
        person[4] = new Person("Носов Нос Носович", "Инженер 5", "test4@mail.ru", "543355433", 40000, 55);

        for (Person list : person) {
            if (list.getAge() > 40)
                System.out.println(list);
        }
    }
}


class Person {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int pay;
    private int age;

    public Person(String fullName, String position, String email, String telephone, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "ФИО: " + fullName + "\n" +
                "Должность: " + position + "\n" +
                "Эл. адрес:" + telephone + "\n" +
                "Зарплата: " + pay + "\n" +
                "Возраст: " + age + "\n";
    }
}