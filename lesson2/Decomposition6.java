package by.peleng.java.lesson2;
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.


import java.util.Scanner;


public class Decomposition6 {
    static void primeNumbers(int x, int y, int z) {
        int maxSumm = 0;
        if (x >= y && x >= z) {
            maxSumm = x;
        } else if (y >= z) {
            maxSumm = y;
        } else {
            maxSumm = z;
        }
        maxSumm = (int) Math.sqrt(maxSumm);
        while (true) {

            //         System.out.println(maxSumm);
            if (x % maxSumm == 0 && y % maxSumm == 0 && z % maxSumm == 0 && maxSumm!=1) {
                System.out.println("Данне числа не взаимнопростые");
                break;

            } else if (maxSumm < 2) {
                System.out.println("Данне числа  взаимнопростые");
                break;

            }


            maxSumm--;

        }


    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число X:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeX = in.nextInt();
        System.out.println("Введите число N:");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeN = in.nextInt();
        System.out.println("Введите число Z:");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int sizeZ = in.nextInt();
        primeNumbers(sizeX,sizeZ,sizeN);

    }
}