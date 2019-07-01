package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы А:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int sizeA = in.nextInt();

        System.out.println("задайте размер матрицы В:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }


        int sizeB = in.nextInt();

        System.out.println("задайте число К (К<А):");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }


        int keyK = in.nextInt();
        if (keyK < sizeA) {


            int[] arrayA = new int[sizeA];
            int[] arrayВ = new int[sizeB];

            Random random = new Random();
            for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = random.nextInt(100) - 50;
                System.out.print(" " + arrayA[i] + " "); //вывод элемента
            }
            System.out.println();
            for (int i = 0; i < arrayВ.length; i++) {
                arrayВ[i] = random.nextInt(100) - 50;
                System.out.print(" " + arrayВ[i] + " "); //вывод элемента
            }
            System.out.println();
            int finalSize = sizeA + sizeB + 1;
            int jk = 0;
            int[] finalArray = new int[finalSize];
            for (int i = 0; i < finalSize; i++) {

                if (i < keyK) {
                    finalArray[i] = arrayA[i];

                } else if (i >= keyK && (finalSize - i) > (sizeA - keyK + 1)) {
                    finalArray[i] = arrayВ[i - keyK];

                } else {
                    finalArray[i] = arrayA[keyK + jk-1];
                    jk++;
                }


            }
            System.out.println("Результат" + Arrays.toString(finalArray));


        } else {
            System.out.println("Число К >= А, что не корректно");
        }
    }
}