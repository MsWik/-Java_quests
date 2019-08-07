package by.peleng.java.lesson2;

/*7. Пусть даны две неубывающие последовательности действительных чисел...*/



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort7 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] array = new int[size];
        int[] arrayB = new int[size];
        int max = 0;

        Random random = new Random();

        for (int j = 0; j < array.length; j++) {//идём по столбцам
            array[j] = random.nextInt(150) - 75;

            System.out.print(" " + array[j] + " "); //вывод элемента


        }
        System.out.println();//перенос строки ради визуального сохранения табличной формы
        for (int j = 0; j < array.length; j++) {//идём по столбцам

            arrayB[j] = random.nextInt(150) - 50;


            System.out.print(" " + arrayB[j] + " "); //вывод элемента


        }
        Arrays.sort(array);
        Arrays.sort(arrayB);

        System.out.println();
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(arrayB));


        int i = 0;
        int j = 0;

        while (i < array.length || j < arrayB.length) {
            if (i < array.length && j < arrayB.length) {
                if (array[i] > arrayB[j]) {
                    System.out.println("Элемент массива  b[" + j + "]" + " Ставим в позицию после элемента a[" + i + "]");
                    if (j < arrayB.length) {
                        j++;
                    }
                } else {
                    if (i < array.length) {
                        i++;
                    }
                }
            } else if (j < arrayB.length) {
                System.out.println("Вставляем b[" + j + "] - b[" + (arrayB.length - 1) + "] и далее элементы массива А");
                break;
            } else {
                break;
            }


        }


    }
}