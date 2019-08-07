package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Scanner;
/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N*/

public class Decomposition10_1 {

    static int[] ch(int chi) {

        int length = 0;
        int inChi = chi;
        while (inChi > 0) {
            inChi = inChi / 10;
            length++;


        }
        int i = length;
        int[] finlArr = new int[length];
        while (chi > 0) {


            finlArr[i - 1] = chi % 10;
            System.out.println(chi);
            chi = chi / 10;
            i--;
        }
        return finlArr;

    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int size = in.nextInt();

        System.out.println("Массив : " + Arrays.toString(ch(size)));

    }
}
