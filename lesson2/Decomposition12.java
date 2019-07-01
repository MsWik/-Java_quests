package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Decomposition12 {
    /*12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не большее N*/
    static void superArray(int sizeK, int sizeN) {
        int sum = 0;
        int length;
        int dub = sizeK;

        while (dub > 0) {
            sum = dub % 10;
            dub = dub / 10;


        }
        if ((sizeN - sum) < 10) {
            length = sizeN - sum;
        } else {
            length = 8;
        }


        System.out.println("Массив элементами которого\n" +
                "являются числа, сумма цифр которых равна К ");


        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            int chSum = 0;
            array[i] = (int) (Math.random() * sizeN);
            int chkNum = array[i];
            do {
                chSum += chkNum % 10;
                chkNum /= 10;

            } while (chkNum > 0);
            {
                if (chSum != sizeK) {
                    i--;
                }
            }
        }

        System.out.println("Результат: " + Arrays.toString(array));

    }

    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число K:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeK = in.nextInt();
        System.out.println("Введите число N:");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeN = in.nextInt();
        superArray(sizeK, sizeN);


    }
}