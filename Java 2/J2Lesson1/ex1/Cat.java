////public class Cat {
////    String name;
////    String color;
////    int age;
////}
//
//
//
////public class Cat {
////    private String name;
////    private String color;
////    private int age;
////    public Cat() {
////        System.out.println("Это конструктор класса Cat") ;
////        name = "Barsik";
////        color = "White";
////        age = 2;
////    }
////}
////class MainClass {
////    public static void main(String[] args) {
////        Cat cat1 = new Cat();
////    }
////}
//
////Параметризированные конструкторы
//
////public class Cat {
////    private String name;
////    private String color;
////    private int age;
////    public Cat(String _name, String _color, int _age) {
////        name = _name;
////        color = _color;
////        age = _age;
////    }
////}
//
//
////Перегрузка конструкторов
////public class Cat {
////    private String name;
////    private String color;
////    private int age;
////
////    public Cat(String _name, String _color, int _age) {
////        name = _name;
////        color = _color;
////        age = _age;
////    }
////
////    public Cat(String _name) {
////        name = _name;
////        color = "Unknown";
////        age = 1;
////    }
////
////    public Cat() {
////        name = "Unknown";
////        color = "Unknown";
////        age = 1;
////    }
////
////    public static void main(String[] args) {
////        Cat cat1 = new Cat();
////        Cat cat2 = new Cat("Barsik");
////        Cat cat3 = new Cat("Murzik", "White", 5);
////    }
////}
//
////Ключевое слово this
//
//public class Cat {
//    private String name;
//    private String color;
//    private int age;
//    public Cat(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//}
