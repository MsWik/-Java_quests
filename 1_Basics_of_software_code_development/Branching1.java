package by.peleng.java.lesson1;
/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
*/

import java.util.Scanner;

public class Branching1 {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите угол 1:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите угол 1:   ");
            in.next();
        }
        double x = in.nextDouble();

        System.out.print("Ввеедите угол 2:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите угол 2:   ");
            in.next();
        }
        double y = in.nextDouble();




        if (((x + y) < 180 && (x + y) == 90) || ((x + y) < 180 && x == 90) || ((x + y) < 180 && y == 90)   ) {


            System.out.println("Треугольник прямоугольный");

        } else if ((x + y) < 180) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не сушествует");
        }


    }


}
