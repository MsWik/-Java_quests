package by.peleng.jav.lesson4;
/*
*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления
* */

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Train train[] = new Train[5];
        Random random = new Random();
        for (int i = 0; i < train.length; i++) {
            train[i] = new Train();
        }
        train[0].setDestination("Минск");
        train[1].setDestination("Минск");
        train[2].setDestination("Вильнюс");
        train[3].setDestination("Минск");
        train[4].setDestination("Москва");


        for (int i = 0; i < train.length; i++) {
            long ms = -946771200000L + random.nextInt(165156156);

            Date dt = new Date(ms);
            train[i].setTrainNumber(random.nextInt(1854));
            train[i].setDate(dt);


        }
        train[3].setTrainNumber(125);
        System.out.print("Ввеедите номер поезда (например 125)  ");
        Scanner in = new Scanner(System.in);
        String str = "";
        do {


            while (!in.hasNextInt()) {
                System.out.println("Ввеедите номер поезда корректно  ");
                in.next();
            }


            int n = in.nextInt();

            for (int i = 0; i < train.length; i++) {
                if (train[i].getTrainNumber() == n) {
                    Train.printInformation(train[i]);

                }

            }
            Scanner strr = new Scanner(System.in);
            System.out.print("Закончить поиск Y/N: ");

            str = strr.nextLine();
        } while (!str.equals("Y"));


        System.out.println("\n");
        System.out.println("Соритровка по нормеу: ");
        System.out.println("----------------------");
        train = Train.sortByNymbers(train);
        Train.printTrains(train);


        System.out.println("\n");
        System.out.println("Сортировка по пункту назначения ");
        System.out.println("------------------");
        train = Train.sortByDestination(train);
        Train.printTrains(train);

    }
}
