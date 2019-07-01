package by.peleng.java.lesson1;

import java.util.Scanner;

/*Вычисляем результат формулы ((num-3)*b/2)+c;*/

public class Linear1 {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);
        System.out.print("Ввеедите число а:   ");

        while (!in.hasNextInt()) {
            System.out.print("Ввеедите число а:   ");
            in.next();
        }
        double num = in.nextInt();
        System.out.print("Ввеедите число в:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите число в:   ");
            in.next();
        }
        double b = in.nextInt();
        System.out.print("Ввеедите число с:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите число с:   ");
            in.next();
        }
        double c = in.nextInt();

        result = ((num - 3) * b / 2) + c;
        System.out.println(result);


    }

}
