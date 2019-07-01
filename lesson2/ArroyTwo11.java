package by.peleng.java.lesson2;

import java.util.Random;
import java.util.Scanner;

public class ArroyTwo11 {


    public static void main(String args[]) {

     /*   Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();*/


        int[][] array = new int[9][19];


        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(15);

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();

        int sym = 0;
        System.out.println("\nЧисло 5 встречается более 3 раз в следубщих строках ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    sym++;
                }
            }


            int k = i + 1;
            if (sym >= 3) {
                System.out.print("  " + k + "   ");
            }
            sym = 0;
        }


    }
}



