package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayTwo13 {

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


            for (int min = 0; min < array[i].length - 1; min++) {
                int least = min;
                for (int j = min + 1; j < array[i].length; j++) {
                    if (array[j][i] < array[least][i]) {
                        least = j;
                    }
                }
                int tmp = array[min][i];
                array[min][i] = array[least][i];
                array[least][i] = tmp;
            }





        }


        System.out.println("\n Вывод ");




        System.out.println("\nНиже представлена с отсортированными столбцами по возрастанию");
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j]+ " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();


        for (int i = 0; i < array.length; i++) {


            for (int min = 0; min < array[i].length - 1; min++) {
                int least = min;
                for (int j = min + 1; j < array[i].length; j++) {
                    if (array[j][i] > array[least][i]) {
                        least = j;
                    }
                }
                int tmp = array[min][i];
                array[min][i] = array[least][i];
                array[least][i] = tmp;
            }





        }

        System.out.println("\n Вывод ");




        System.out.println("\nНиже представлена с отсортированными столбцами по убыванию");
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j]+ " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

    }



}
