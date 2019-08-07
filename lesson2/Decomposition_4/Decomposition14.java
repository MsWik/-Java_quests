package by.peleng.java.lesson2;

import java.util.Scanner;

/* Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
*/


public class Decomposition14 {
    static int[] arrayOfPrimeNumbers(long chi) {

        int length = 0;
        long inChi = chi;
        while (inChi > 0) {
            inChi = inChi / 10;
            length++;


        }
        int i = length;
        int[] finlArr = new int[length];
        while (chi > 0) {


            finlArr[i - 1] = (int) chi % 10;

            chi = chi / 10;
            i--;
        }
        return finlArr;

    }// возвращаем массив цифр из которого состоит число

    static void armstrongNumber(long chit) {


        for (long i = 1; i <= chit; i++) {

            long sumArm = 0;
            int[] array = arrayOfPrimeNumbers(i).clone();
            for (int j = 0; j < array.length; j++) {

                sumArm += Math.pow(array[j], array.length);

            }
            if (i == sumArm) {
                System.out.println("Число   " + sumArm + "    является числом Армстронга  " + i);

            }

        }
    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);


        System.out.println("Введите число К:");
        while (!in.hasNextLong()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        long sizeК = in.nextLong();
        armstrongNumber(sizeК);
    }
}