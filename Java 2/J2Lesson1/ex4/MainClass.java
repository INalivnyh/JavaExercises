public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Cat cat = new Cat("Barsik", "White");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
        if(cat instanceof Cat){

        }
    }
}