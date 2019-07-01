package by.peleng.java.lesson2;

import java.util.Random;
import java.util.Scanner;

public class arrayTwo3 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы M*N: M - ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int m = in.nextInt();
        System.out.println("задайте размер матрицы M*N: N - ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int n = in.nextInt();


        int[][] array = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(100);

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();


        System.out.println("Введите номер строки для вывода ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно  ");
            in.next();
        }
        int line = in.nextInt() - 1;
        System.out.println("Введите номер столбца для вывода ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно  ");
            in.next();
        }
        int column = in.nextInt() - 1;
        System.out.println("\n Вывод строки ");

        for (int j = 0; j < array[line].length; j++) {

            System.out.print(array[line][j] + " ");
        }
        System.out.println("\n Вывод столбца ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i][column] + " ");
        }


    }
}
