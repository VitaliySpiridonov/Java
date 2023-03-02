package HomeWorkJava;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("ФИО: %s занимаемый должность: %s email: %s Телефон: %s Зарплата: %s Возраст: %s%n", name, position, email, phone, salary, age);
    }

    public int getAge() {

        return age;
    }
}
