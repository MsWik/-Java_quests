package by.peleng.java.lesson2;


//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

import java.util.Scanner;

public class Decomposition7 {

    static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);
    }

    static long factorial(int a) {
        long result = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                result += calc(i);
            }

        }

        return result;

    }

    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("До какого числа считать факториал (например 9) :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно число :   ");
            in.next();
        }
        int size = in.nextInt();

        System.out.println("Сумма четных факториалов от 1 до: " + size + "  -  " + factorial(size));
        System.out.println(calc(size));
    }
}