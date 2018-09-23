public class Cat extends Animal {
    protected String color;
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void catInfo() {
        System.out.println("Cat: " + name + " " + color);
    }
}



//super

//public class Cat extends Animal {
//    private int b;
//    protected int z;
//    public Cat(int a, int b) {
//        super(a);        // первым делом вызываем конструктор Animal
//        this.b = b;
//    }
//    public void test() {
//        z = 10;          // Обращение к полю z класса Cat
//        super.z = 20;    // Обращение к полю z класса Animal
//    }
//}
