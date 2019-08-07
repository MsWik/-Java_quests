package by.peleng.java.lesson2;
/*9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        столбец содержит максимальную сумму.*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArroyTwo9 {
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

        int summa = 0;

        int[] byfer = new int[array[0].length];


        for (int i = 0; i < array[0].length; i++) {
            summa = 0;
            for (int j = 0; j < array.length; j++) {
                summa += array[j][i];


            }
            byfer[i] = summa;


        }


        System.out.println(Arrays.toString(byfer));

        int max = 0;
        int key = 0;
        for (int i = 0; i < byfer.length; i++) {
            if (max < byfer[i]) {
                key = i;
                max = byfer[i];
            }

        }
        key++;
        System.out.println("МИскомая сумма находится в столбце " + key);


    }
}