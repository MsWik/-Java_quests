package by.peleng.java.lesson1;

import java.util.Scanner;

/*Урок 3. Вычисление значений по формуле */
public class Linear3 {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число Х:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число Х:   ");
            in.next();
        }
        double x = in.nextDouble();
        System.out.print("Ввеедите число Y:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число Y:   ");
            in.next();
        }
        double y = in.nextDouble();


        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println(result);

    }
}