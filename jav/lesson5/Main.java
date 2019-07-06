package by.peleng.jav.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Сounters counters;
        System.out.println("Создать счетчик:");
        System.out.println("-------------");
        System.out.println("1)Инициализировать счетчик базовыми параметрами");
        System.out.println("2)Инициализировать счетчик своими параметрами");
        System.out.println("-------------");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Ввеедите номер корректно  ");
            in.next();
        }
        int key = in.nextInt();
        String str;

        switch (key) {
            case (1):
                counters = new Сounters();
                break;
            case (2):
                System.out.println("Введите свои параметры:");
                System.out.println("-------------");
                System.out.println("Введите значение счетчика");
                int zn = in.nextInt();
                System.out.println("Введите значение MAX");
                int max = in.nextInt();
                System.out.println("Введите значение MIN");
                int min = in.nextInt();
                if (max > min && max > zn && zn > min) {
                    counters = new Сounters(zn, max, min);
                } else {
                    System.out.println("Не корректный ввод");
                    counters = new Сounters();
                }

                break;


            default:
                System.out.println("Не верный выбор. Счетчик иницализирован по умолчанию");
                counters = new Сounters();
                break;
        }


        System.out.println("-------------");
        do {

            System.out.println("1)Увеличить значение счетчика");
            System.out.println("2)Уменьшить значение счетчика");
            System.out.println("3)Получить значение счетчика");
            System.out.println("4)Установить новый MAX");
            System.out.println("5) Установипть новый MIN");
            System.out.println("-------------");

            Scanner ins = new Scanner(System.in);
            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер  корректно  ");
                in.next();
            }
            int keys = in.nextInt();


            switch (keys) {
                case (1):
                    counters.maxCounter();
                    System.out.println("Значение счетчика : " + counters.getCounter());
                    break;
                case (2):

                    counters.minCounter();
                    System.out.println("Значение счетчика : " + counters.getCounter());

                    break;

                case (3):

                    System.out.println("Значение счетчика : " + counters.getCounter());

                    break;
                case (4):
                    System.out.println("Введите значение MAX");
                    int max = in.nextInt();
                    if (max > counters.getMAX_VALUE()) {
                        counters.setMAX_VALUE(max);

                    }

                    break;
                case (5):

                    System.out.println("Введите значение MIN");
                    int min = in.nextInt();
                    if (min > counters.getMIN_VALYE()) {
                        counters.setMAX_VALUE(min);
                    }

                    break;


                default:
                    System.out.println("Не верный выбор. ");

                    break;


            }
            Scanner strr = new Scanner(System.in);
            System.out.print("Закончить  Y/N: ");
            str = strr.nextLine();
        }
        while (!str.equals("Y"));


    }

}