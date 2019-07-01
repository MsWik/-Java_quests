package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort4 {
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
            array[j] =j*2;
            System.out.print(" " + array[j] + " "); //вывод элемента
        }
        System.out.println();//перенос строки ради визуального сохранения табличной формы
        int key=0;

            int min;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] < array[i+1]){
                    min = array[i];
                    array[i] = array[i+1];
                    array[i+1] = min;
                    key++;
                }
            }







        System.out.println("Результат: " + Arrays.toString(array));
        System.out.println("число перестановок : " + key);



    }
}