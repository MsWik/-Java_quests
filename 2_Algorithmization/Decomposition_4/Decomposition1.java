package by.peleng.java.lesson2;
/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
        натуральных чисел:
        
*/


import java.util.Scanner;

public class Decomposition1 {
   static int nod(int first,int second){

        return second == 0 ? first : nod(second,first % second);

    }

    static long nok(int first,int second){
        return first / nod(first,second) * second;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте А:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно А:   ");
            in.next();
        }
        int sizeA = in.nextInt();

        System.out.println("задайте размер В:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно В:   ");
            in.next();
        }



        int sizeB = in.nextInt();

        System.out.println("Наибольший общий делитель "+  nod(sizeA, sizeB));
        System.out.println("Наименьшее общее кратное "+  nok(sizeA, sizeB));
    }



}
