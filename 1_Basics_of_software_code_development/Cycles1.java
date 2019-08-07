package by.peleng.java.lesson1;

import java.util.Scanner;
/*1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.*/
public class Cycles1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число Х:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число  ");
            in.next();
        }
        int x = in.nextInt();
        int sum = 0;

        while (true) {
            if (x < 1) {
                System.out.print("Введите число больше 1  ");
                while (!in.hasNextInt()) {
                    System.out.print("Ввеедите корректное число   ");
                    in.next();
                }

                x = in.nextInt();
            } else {
                for (int i = 1; i <= x; i++) {
                    sum += i;
                }
                break;
            }
        }
        in.close();
        System.out.println(sum);


    }
}
