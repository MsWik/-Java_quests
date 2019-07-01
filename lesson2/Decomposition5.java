package by.peleng.java.lesson2;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Decomposition5 {


    static int secondH (int b[]) {
        int highest=b[0];
        int secondHighest=b[0];
        for (int i = 0; i < b.length; i++) {


            if (b[i] > highest) {


                secondHighest = highest;


                highest = b[i];
            } else if (b[i] > secondHighest)

                secondHighest = b[i];
        }
        return secondHighest;
    }




    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] arrayХ = new int[size];


        Random random = new Random();

        for (int j = 0; j < arrayХ.length; j++) {//идём по столбцам
            arrayХ[j] = random.nextInt(150);




        }

        System.out.println("Массив : " + Arrays.toString(arrayХ));

        System.out.println("Второе по величине число в массиве : " + secondH(arrayХ));
    }

}
