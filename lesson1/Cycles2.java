package by.peleng.java.lesson1;

import java.util.Scanner;
/* Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class Cycles2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите начало отрезка А:   ");
        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректное число А ");
            in.next();
        }
        float a = in.nextFloat();


        System.out.print("Ввеедите конец отрезка В:   ");
        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректное число В ");
            in.next();
        }
        float b = in.nextFloat();

        System.out.print("Ввеедите шаг h   ");
        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректный шаг h ");
            in.next();
        }
        float h = in.nextFloat();

        in.close();

        for (float i = a; i < b; i += h) {
            if (i <= 2) {
                System.out.println(-i);
            } else System.out.println(i);
        }


    }


}
