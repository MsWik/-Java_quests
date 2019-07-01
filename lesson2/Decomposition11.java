package by.peleng.java.lesson2;

import java.util.Scanner;





public class Decomposition11 {

    static void ch (int chi, int chi2) {

        int lrngth1=0;
        int lrngth2=0;
        while (chi > 0) {
            chi = chi / 10;
            lrngth1++;
        }
        while (chi2 > 0) {
            chi2 = chi2 / 10;
            lrngth2++;
        }

        if (lrngth1>lrngth2){ System.out.println("Число чисел А больше числа чисел числа Б");} else
            if (lrngth1<lrngth2 ){System.out.println("Число чисел А меньше числа чисел числа Б");} else
            {System.out.println("Число чисел А равно числу чисел числа Б");}


    }




    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число А:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeА = in.nextInt();
        System.out.println("Введите число Б:");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeВ = in.nextInt();
        ch(sizeА,sizeВ);







    }
}