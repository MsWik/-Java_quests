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

public class Train {
    private String destination;
    private int trainNumber;
    private Date date = new Date();


    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static void printInformation(Train train) {
        System.out.println("\n\n");
        System.out.println("Номер поезда " + train.getTrainNumber());
        System.out.println("Пункт назначения - " + train.getDestination());
        System.out.println("Время отправления - " + train.getDate());
        System.out.println("*****\n\n");
    }

    public static Train[] sortByNymbers(Train[] trains) {
        for (int i = 1; i < trains.length; i++) {
            int j = i;
            while (trains[j].getTrainNumber() < trains[j - 1].getTrainNumber()) {
                Train temp = trains[j];
                trains[j] = trains[j - 1];
                trains[j - 1] = temp;

                j--;

                if (j == 0) {
                    break;
                }
            }
        }

        return trains;
    }

    public static Train[] sortByDestination(Train[] trains) {

        for (int i = 1; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i; j++) {
                if (trains[j].getDestination().compareTo(trains[j + 1].getDestination()) < 0) {

                    Train temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;

                }


            }
        }
        for (int i = 1; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getDestination().compareTo(trains[j + 1].getDestination())
                        == 0
                        && trains[j].getDate().before(trains[j + 1].getDate())) {

                    Train temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;

                }


            }
        }


        return trains;
    }


    public static void printTrains(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println("\n\n*****");
            System.out.println("Номер- " + trains[i].getTrainNumber());
            System.out.println("Пункт назначения - " + trains[i].getDestination());
            System.out.println("Время отправления - " + trains[i].getDate());
            System.out.println("*****\n\n");
        }
    }


}

