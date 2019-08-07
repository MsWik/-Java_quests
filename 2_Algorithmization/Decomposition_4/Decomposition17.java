package by.peleng.java.lesson2;

import java.util.Scanner;

/*17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
public class Decomposition17 {


    static int sumOfNumbers(long sum) {

        int result = 0;
        while (sum > 0) {


            result += (int) sum % 10;

            sum = sum / 10;

        }
        return result;
    }


    static void sumOfNumbersResult(long sumI) {
        long duplicate = sumI;
        int result = 0;
        while (true) {
            duplicate -= sumOfNumbers(duplicate);
            result++;

            if (duplicate == 0) {
                System.out.println(sumI + "  Подходит.    Число вычитаний суммы цифр :  " + result);
                break;


            }

            if (duplicate < 0) {
                System.out.println("Число не подходит. Выполнено вычитаний  " + result);
                break;


            }


        }

    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);


        System.out.println("Введите число N");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeК = in.nextInt();
        sumOfNumbersResult(sizeК);/*
        for (int i=11; i<sizeК;i++) {
            sumOfNumbersResult(i);}*/

    }
}
