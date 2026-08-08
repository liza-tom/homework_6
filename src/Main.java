public class Main {
    public static void main(String[] args) {
        //task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //task 3
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        //task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //task 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //task 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //task 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //task 8
        int sum = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum * i + " рублей");
        }

        //task 9
        for (int i = 1; i <= 12; i++) {
            int total = sum * i;
            int withPercent = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + withPercent + " рублей");
        }

        //task 10
        int multiply = 2;
        for (int i = 1; i <= 10; i++) {
            int result = multiply * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}