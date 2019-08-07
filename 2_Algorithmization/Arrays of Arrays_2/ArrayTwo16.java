package by.peleng.java.lesson2;
/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,

так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:*/

import java.util.Random;
import java.util.Scanner;


public class ArrayTwo16 {
    static boolean proverka(int[] ar, int[] ar2) {
        int summa1 = 0;
        int summa2 = 0;
        for (int i = 0; i < ar.length; i++) {
            summa1 += ar[i];
            summa2 += ar2[i];


        }
        if (summa1 == summa2) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[][] array = new int[size][size];


        Random random = new Random();

        int[] check = new int[size];
        int[] check1 = new int[size];
        while (true) {
            int bonus = 0;
            for (int i = 0; i < array.length; i++) {  //идём по строкам
                for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                    array[i][j] = random.nextInt(size * size);


                }

            }

            for (int i = 0; i < array.length - 1; i++) {
                if (proverka(array[i], array[i + 1])) {
                    bonus++;

                }
            }


            for (int k = 0; k < array.length - 1; k++) {  //идём по строкам
                for (int j = 0; j < array[k].length; j++) {//идём по столбцам
                    check[j] = array[j][k];
                    check1[j] = array[j][k + 1];


                }

                if (proverka(check, check1)) {
                    bonus++;
                }

            }

           for (int j = 0, i=array[j].length-1; j < array.length; j++, i--)

            {
            //    System.out.println(i +  "    "  + j);

                check[j] = array[j][j];
                check1[j] = array[j][i];
            }


            if (proverka(check, check1)) {
                bonus++;
            }


            if (bonus == (array.length*2)-1) {


                for (int k = 0; k < array.length; k++) {  //идём по строкам
                    for (int j = 0; j < array[k].length; j++) {//идём по столбцам


                        System.out.print(" " + array[k][j] + " "); //вывод элемента
                    }
                    System.out.println();//перенос строки ради визуального сохранения табличной формы
                }

                break;
            }

        }


    }
}

