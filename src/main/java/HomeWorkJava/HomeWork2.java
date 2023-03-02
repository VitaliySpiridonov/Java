package HomeWorkJava;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(6, 9));
        isPositiveOrNegative(0);
        System.out.println(isNegative(0));
        printWordNTimes("Привет, мир!", 6);
    }

    // Задание 1
    public static boolean within10and20(int x1, int x2) {
        return (x1 + x2) >= 10 && (x1 + x2) <= 20;
    }

    // Задание 2
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

    // Задание 3
    public static boolean isNegative(int x) {
        return x < 0;
    }

    // Задание 4
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}