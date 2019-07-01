package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Decomposition8 {

    static int calc1(int n1, int n2, int n3) {

        return n1 + n2 + n3;
    }

    public static int summ(int[] array, int from, int to) {
        int summ = 0;
        if (from >= 0 && to < array.length && from <= to) {
            for (int i = from; i <= to; i++) {
                summ += array[i];
            }
        } else {
            System.out.println("\n" +
                    "Ваш номер элемента вне диапазона массива");

        }
        return summ;
    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] arrayХ = new int[size];


        Random random = new Random();

        for (int j = 0; j < arrayХ.length; j++) {//идём по столбцам
            arrayХ[j] = random.nextInt(150);


        }

        System.out.println("Массив : " + Arrays.toString(arrayХ));


        System.out.println("Введите N :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int n = in.nextInt();


        System.out.println("Введите K (больше на 2 и более N):");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int k = in.nextInt();


        if (k > n + 1 && k < arrayХ.length) {

            System.out.println("Сумма от элемента " + n + " до  " + k + " -  " + summ(arrayХ, n-1, k-1));
        } else {
            System.out.print("N-K<2 или больше длины массива   ");
        }



    }
}