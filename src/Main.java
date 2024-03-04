
public class Main {
    public static void main(String[] args) {
        //       С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("\nTask 1 ");
        System.out.print("Числа от 1 до 10 : ");
        for (int i = 1; i <= 10; i++) {

            System.out.print(i + " ");
        }
        System.out.println("\n\nTask 2 ");
        //       С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.print("числа от 10 до 1 : ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\nTask 3 ");
        System.out.print("Четные числа от 0 до 17 = ");
        // Выведите в консоль все четные числа от 0 до 17.
        for (int i = 2; i <= 17; i += 2) {
            System.out.print(" " + i);
        }
        System.out.println("\n\nTask 4 ");
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        System.out.print("Числа от 10 до −10 = ");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nTask 5 ");
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате: «… год является високосным».
//
        for (int i = 1904; i <= 2096; i = i + 4) {
            if ((i % 400) == 0 || (i % 4 == 0 && (i % 100) != 0 && i > 1584)) {
                System.out.println(i + "год является високосным ");
            }
        }
        System.out.println("\nTask 6 ");
//        Напишите программу, которая выводит в консоль последовательность чисел:
////        7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(" " + i);
        }
        System.out.println("\n\nTask 7 ");
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512


        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(" " + i);
        }

        System.out.println("\n\nTask 8 ");
//        Посчитайте с помощью цикла for сумму годовых накоплений,
//                если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        int deposit = 29000;
        int capital = 0;
        for (int i = 1; i <= 12; i++) {
            capital += deposit;
            System.out.println("За " + i + "месяц, сумма накоплений равна " + capital + " рублей");
        }

        System.out.println("\nTask 9 ");
        float percent = 1.01f;
        capital = 0;
        for (int i = 1; i <= 12; i++) {
            capital+= deposit;
            deposit*=percent;
            System.out.println("За " + i + "месяц, сумма накоплений равна " + capital + " рублей");
        }
        System.out.println("\nTask 10 ");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        for (int i = 1; i <= 10; i++) {
            int result=2*i;
            System.out.println("2*" + i + "=" + result);
        }

    }
}