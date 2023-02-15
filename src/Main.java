public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int monht = 1;
        while ( total <=2_459_000 ) {

            total = total + salary;
            monht = monht + 1;
            System.out.println("Месяц " + monht + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i <= 9) {
            i = i + 1;
            System.out.println(i);
        }

        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }

    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 0;
        int people = 12_000_000;
        while ( year <= 9 ) {
            year = year + 1;
            people = people + (people / 1000 * 17) - (people / 1000 * 8);
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }



    }
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int monht = 0;
        while (total <= 12_000_000) {
            total = total + total / 100 * 4;
            total = total + salary;
            monht = monht + 1;
            System.out.println(" Месяц " + monht + " сумма накоплений " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int monht = 0;
        while (total <= 12_000_000) {
            total = total + total / 100 * 4;
            total = total + salary;
            monht = monht + 1;
            if (monht % 6 == 0)
                System.out.println(" Месяц " + monht + " сумма накоплений " + total);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (month <= 108) {
            total = total + total / 100 * 7;
            total = total + salary;
            month = month + 1;
            if (month % 6 == 0)
                System.out.println(" Месяц " + month + " сумма накоплений " + total);
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int i = 7;
        System.out.println(" Сегодня " + i + "-е число. Необходимо подготовить отчёт ");
        while (i <= 31) {
            i = i + 7;
            if (i < 32)
                System.out.println(" Сегодня " + i + "-е число. Необходимо подготовить отчёт ");


        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int i = 0;
        while (i <= 2123) {
            i = i + 79;
            if (i >= 1823 && i <= 2123)
                System.out.println(i);


        }
    }

}