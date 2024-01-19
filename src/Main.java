public class Main {
    public static void main(String[] args) {

        System.out.println("-------------");

        task1(1);
        task1(0);
        task1(-3);

        System.out.println("-------------");

        task2(1);
        task2(0);
        task2(-3);

        System.out.println("-------------");

        task3(1);
        task3(0);
        task3(-3);

        System.out.println("-------------");

        task4(1);
        task4(0);
        task4(-3);

        System.out.println("-------------");

        task5(1);
        task5(0);
        task5(-3);

        System.out.println("-------------");

        task6(1);
        task6(0);
        task6(-3);

        System.out.println("-------------");

        task7(12, 3);

        System.out.println("-------------");

        task8(1,1);
        task8(3, 5);

        System.out.println("-------------");

        task9(true);
        task9(false);

        System.out.println("-------------");

        task10(true);
        task10(false);

        System.out.println("-------------");

        task11(5);
        task11(0);
        task11(-3);
        task11(2);

        System.out.println("-------------");

        task12(5);
        task12(0);
        task12(-3);
        task12(2);

        System.out.println("-------------");

        task13(1, 3);
        task13(0, 6);
        task13(3, 5);

        System.out.println("-------------");

        task14(12, 23);
        task14(2, 11);
        task14(8, 4);

        System.out.println("-------------");

        task15(2);

        System.out.println("-------------");

        task16(23);

        System.out.println("-------------");

        task17(8);

        System.out.println("-------------");


    }

    public static void task1(int a1) {
        if (a1 == 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task2(int a2) {
        if (a2 > 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task3(int a3) {
        if (a3 < 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task4(int a4) {
        if (a4 >= 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task5(int a5) {
        if (a5 <= 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task6(int a6) {
        if (a6 != 0) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task7(int a7, int test) {
        if (a7 == test) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }
    // не знаю как сделать 7,8
    public static void task8(int a8, int test) {
        if (a8 == test) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task9(boolean test) {
        System.out.println(test ? "Right!" : "Nope!");
    }

    public static void task10(boolean test) {
        System.out.println(test ? "Right!" : "Nope!");
    }

    public static void task11(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task12(int a) {
        if (a == 0 || a == 2) {
            System.out.println(a + 7);
        } else {
            System.out.println(a / 10);
        }
    }

    public static void task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }

    public static void task14(int a, int b) {
        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            System.out.println("Right!");
        } else {
            System.out.println("Nope!");
        }
    }

    public static void task15(int num) {
        String result = "";

        switch (num) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Лето";
                break;
            case 4:
                result = "Осень";
                break;
        }

        System.out.println(result);
    }

    public static void task16(int day) {
        if (day >= 1 && day <= 10) {
            System.out.println("Перша декада");
        } else if (day > 10 && day <= 20) {
            System.out.println("Друга декада");
        } else if (day > 20 && day <= 30) {
            System.out.println("Третя декада");
        } else {
            System.out.println("Четверта декада");
        }
    }
    public static void task17(int month) {
        if (month >= 1 && month <= 3) {
            System.out.println("Зима");
        } else if (month > 3 && month <= 6) {
            System.out.println("Лето");
        } else if (month > 6 && month <= 9) {
            System.out.println("Весна");
        } else if (month > 9 && month <= 12) {
            System.out.println("Осень");
        }
    }
    public static void task18() {
 // не знаю как сделать
        }
        public static void task19() {
        // не знаю
        }
        public static void task20() {
        // не знаю
        }
        public static void task21() {
        // не знаю
        }
    }

