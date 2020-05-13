import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //2
        int i = 15;
        byte b = 1;
        short s = 3;
        long l = 4000000L;

        float f = 1.9f;
        double d = 6.3;

        char c = 'c';

        //3
        System.out.println(calculate(5.2f, 6.4f, 7.7f, 3.6f));
        //4
        System.out.println(task10to20());
        //5
        positiveToNegative1();
        //6
        System.out.println(positiveToNegative2());
        //7
        greeting();
        //8
        leapYear();
    }

    //3
    static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4
    static boolean task10to20() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    //5
    static void positiveToNegative1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (0 <= a) {
            System.out.println("Numeric is positive");
        } else {
            System.out.println("Numeric is negative");
        }
    }

    //6
    static boolean positiveToNegative2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) return true;
        else return false;
    }

    //7
    static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name");
        String s = scanner.nextLine();
        System.out.println("Hello, " + s + "!");
    }

    //8
    static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год невисокосный");
        } else if (year % 4 == 0) {
            System.out.println("Год високосный");
        }
        else System.out.println("Год невисокосный");
    }
}

