package HomeWorkJava6;

public class Animals {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.name + " пробежал: " + dist + " метров.");
        else System.out.println(this.name + " столько не пробежит.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.name + " проплыл: " + dist + " метров.");
        else System.out.println(this.name + " столько не проплывёт.");
    }
}
