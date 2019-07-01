package by.peleng.java.lesson1;

import java.util.Scanner;

/*Урок 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
*/
public class Linear2 {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число Б:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число Б:   ");
            in.next();
        }
        double a = in.nextDouble();
        System.out.print("Ввеедите число А:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число А:   ");
            in.next();
        }
        double b = in.nextDouble();
        System.out.print("Ввеедите число С:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число С:   ");
            in.next();
        }
        double c = in.nextDouble();

        result = (a + Math.sqrt(Math.pow(a, 2) + 4 * b * c)) / (2 * b) - Math.pow(b, 3) * c + Math.pow(a, -2);

        System.out.println(result);

    }
}