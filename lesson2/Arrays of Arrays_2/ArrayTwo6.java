package by.peleng.java.lesson2;
/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

import java.util.Scanner;

public class ArrayTwo6 {
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
            for (int i=0;i<array.length;i++){

                if(i <= (array.length - 1) / 2){
                    for(int j = i; j < array[i].length - i; j++){

                        array[i][j] = 1;

                    }
                }else{
                    for(int j = array[i].length - i-1; j < i+1; j++){
                        array[i][j]=1;

                    }
                }


            }

            System.out.println("\nНиже представлена матрица нужной формы");
            for (int i = 0; i < array.length; i++) {  //идём по строкам
                for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                    System.out.print(" " + array[i][j] + " "); //вывод элемента
                }
                System.out.println();//перенос строки ради визуального сохранения табличной формы
            }

            System.out.println();






        }  else {
            System.out.println("Введенное вами значение не удовлетворяет условию, попробуйе еще раз:");
        }
    }


}
