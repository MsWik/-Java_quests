package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort3 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] array = new int[size];
        int max = 0;

        Random random = new Random();

        for (int j = 0; j < array.length; j++) {//идём по столбцам
            array[j] = random.nextInt(5)*j;
            System.out.print(" " + array[j] + " "); //вывод элемента
        }
        System.out.println();//перенос строки ради визуального сохранения табличной формы


        System.out.println();


        for (int min = 0; min < array.length; min++) {
            int least = min;
            for (int j = min ; j < array.length; j++) {
                if (array[j] > array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }

        System.out.println("Result: " + Arrays.toString(array));


    }
}
