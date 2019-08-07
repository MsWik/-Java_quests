package by.peleng.java.lesson2;
/*5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

import java.util.Scanner;

public class ArrayTwo5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.println("задайте размер матрицы: (четное число)");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();
        if (size > 0 && size % 2 == 0) {

            int[][] array = new int[size][size];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - i; j++) {
                    array[i][j] = i + 1;
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }


        } else {
            System.out.println("Введенное вами значение не удовлетворяет условию, попробуйе еще раз:");
        }
    }
}