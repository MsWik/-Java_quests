package by.peleng.java.lesson2;
/*14. Сформировать случайную матрицу m x n*//*, состоящую из нулей и единиц, причем в каждом столбце число
        единиц равно номеру столбца.*/

import java.util.Random;
import java.util.Scanner;

public class ArrayTwo14 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы MxN - M :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();
        System.out.println("задайте размер матрицы MxN - N ::");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int nsize = in.nextInt();

        int[][] array = new int[size][nsize];
        int minMax = 0;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = i; j < array[i].length; j++) {//идём по столбцам

                array[i][j] = 1;

            }


        }

        System.out.println();


        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

    }
}