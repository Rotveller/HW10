public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
    }

    public static void task2() {
        System.out.println("Task 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Task 3");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        String eRule = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + eRule);
    }
}

