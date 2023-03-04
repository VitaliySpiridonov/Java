package HomeWorkJava6;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(500);
        dogBobik.swim(10);
        catBarsik.run(200);
        catBarsik.swim(0);
    }
}