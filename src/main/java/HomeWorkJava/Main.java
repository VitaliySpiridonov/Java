package HomeWorkJava;

public class Main {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "petro@mailbox.com", "892397531", 40000, 25);
        persArray[2] = new Employee("Sidorov Sidor", "Engineer", "sidor@mailbox.com", "892313579", 35000, 45);
        persArray[3] = new Employee("Andreev Andrey", "Engineer", "andrey@mailbox.com", "892398765", 50000, 34);
        persArray[4] = new Employee("Aleksandrov Aleksandr", "Engineer", "aleks@mailbox.com", "892312345", 45000, 56);

        for (Employee employee : persArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();

            }
        }
    }
}