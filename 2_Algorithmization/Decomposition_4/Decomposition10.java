package by.peleng.java.lesson2;

import java.util.Scanner;





public class Decomposition10 {
static char ch (int chi){


    return Character.forDigit(chi, 10);
}

    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива :");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно:   ");
            in.next();
        }
        int size = in.nextInt();

        while (size>0){
            int b = size%10;
            size=size/10;
            System.out.println(ch(b));



        }
    }
}