package by.peleng.java.lesson1;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

import java.util.Scanner;

public class Linear5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число секунд   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите секунды:   ");
            in.next();
        }
        int sek = in.nextInt();

        int hour = sek / 3600;
        int min = (sek - (hour * 3600)) / 60;
        int finsek = sek - (min * 60 + hour * 3600);
        System.out.println(hour + " чч " + min + " мин " + finsek + " сеек");
    }
}