package by.peleng.java.lesson2;

import java.util.Scanner;

/*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/


public class Decomposition13 {
    static boolean Pr(int fl) {
        if (Math.abs(fl) < 2) {
            return false;
        }
        if (Math.abs(fl) == 2) {
            return true;
        }

        double runner = Math.sqrt(fl);
        for (int i = 2; i < runner; i++) {
            if (fl % i == 0) {
                return false;
            }

        }
        return true;

    }


    static void numberOfTwins(int fl) {
        for (int i = fl; i < fl * 2 - 2; i++) {
            if (Pr(i) && Pr(i + 2)) {
                int fin = i + 2;
                System.out.println("Пара чисел близницов :" + i + "   " + fin);

            }


        }

    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);


        System.out.println("Введите число N:");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeN = in.nextInt();
        numberOfTwins(sizeN);

    }
}