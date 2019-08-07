package by.peleng.java.lesson2;
/*4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/


import java.util.Scanner;

public class ArrayTwo4 {
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


            for (int i = 0; i < array.length; i++) {  //идём по строкам

                if (i % 2 == 0) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = j + 1;
                        System.out.print(" " + array[i][j] + " "); //вывод элемента
                    }
                } else {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = array[j].length - j;
                        System.out.print(" " + array[i][j] + " "); //вывод элемента
                    }
                }


                System.out.println();//перенос строки ради визуального сохранения табличной формы
            }
        } else {
            System.out.println("Введенное вами значение не удовлетворяет условию, попробуйе еще раз:");
        }
    }


}
