package HomeWorkJava6;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Кошки не плавают!");
    }
}
