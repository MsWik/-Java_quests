package by.peleng.java.lesson2;
/*2. Даны две последовательности
        a1  a2  an и b1  b2  bm
        . Образовать из них новую последовательность
        чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort2 {

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

        int[] arrayA = new int[sizeA];
        int[] arrayВ = new int[sizeB];

        Random random = new Random();
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(2) +i*2;
            System.out.print(" " + arrayA[i] + " "); //вывод элемента
        }
        System.out.println();
        for (int i = 0; i < arrayВ.length; i++) {
            arrayВ[i] = random.nextInt(2) +i*3;
            System.out.print(" " + arrayВ[i] + " "); //вывод элемента
        }
        System.out.println();
        int[] finalArray = new int[arrayA.length+arrayВ.length];
        System.arraycopy(arrayA, 0, finalArray, 0, arrayA.length);
        System.arraycopy(arrayВ, 0, finalArray, arrayA.length, arrayВ.length);
        Arrays.sort(finalArray);

        System.out.println("Результат" + Arrays.toString(finalArray));


    }
}
