package by.peleng.java.lesson1;

import java.util.Scanner;

/*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
*/
public class Cycles5 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число Е:   ");
        while (!in.hasNextFloat()) {
            System.out.print("Ввеедите корректное число Е ");
            in.next();
        }
        float e = in.nextFloat();
        in.close();

        double sum = 0;

        for (int i = 1; ; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            } else {

                break;
            }
            if (Integer.MAX_VALUE == i) {
                System.out.println("Число задано не корректно");
                break;
            }
        }
        System.out.println(sum);
    }
}