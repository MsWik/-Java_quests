package by.peleng.java.lesson2;

import java.util.Scanner;

/*16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/
public class Decomposition16 {

    static int[] arrayOfPrimeNumbers(long chi) {

        int length = 0;
        long inChi = chi;
        while (inChi > 0) {
            inChi = inChi / 10;
            length++;


        }
        int i = length;
        int[] finlArr = new int[length];
        while (chi > 0) {


            finlArr[i - 1] = (int) chi % 10;

            chi = chi / 10;
            i--;
        }
        return finlArr;


    }

    static void sumOfPositive(long mValue) {
        int fin = 0;
        int[] array = arrayOfPrimeNumbers(mValue).clone();
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                fin++;
            }

        }
        System.out.println("Содержит четных цифр:  " + fin);

    }


    static void check(int n) {
        long maxValue = 0;
        for (long i = (long) Math.pow(10, n - 1) + 1; i < (long) Math.pow(10, n) - 1; i++) {
            int fin = 0;

            int[] array = arrayOfPrimeNumbers(i).clone();
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 != 0) {
                    fin++;
                } else {
                    fin--;
                }


            }
            if (fin == n) {
                maxValue += i;
            }
        }
        System.out.println("Искомая сумма:  " + maxValue);
        sumOfPositive(maxValue);

    }

    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);


        System.out.println("Введите число N");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeК = in.nextInt();
        check(sizeК);
    }
}
