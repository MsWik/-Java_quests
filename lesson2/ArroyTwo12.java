package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArroyTwo12 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[][] array = new int[size][size];


        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(15);

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }


        System.out.println("\n Вывод ");


        System.out.println("\nНиже представлена с отсортированными столбцами по возрастанию");
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();


        System.out.println("\n Вывод ");

        for (int i = 0; i < array.length; i++) {
            array[i]= Arrays.stream(array[i]).boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        }


        System.out.println("\nНиже представлена с отсортированными строками по убыванию");
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

    }

}
