package by.peleng.java.lesson2;
/*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        пользователь с клавиатуры.*/
import java.util.Random;
import java.util.Scanner;

public class ArrayTwo8 {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер матрицы M*N: M - ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int m = in.nextInt();
        System.out.println("задайте размер матрицы M*N: N - ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int n = in.nextInt();


        int[][] array = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(100);

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();




        System.out.println("Введите номер первого столбца для обмена ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно номер ");
            in.next();
        }
        int Column = in.nextInt() - 1;
        System.out.println("Введите номер второго столбца для обмена ");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно  ");
            in.next();
        }
        int nextColumn = in.nextInt() - 1;



        System.out.println("\n Вывод  ");

        int [] byfer = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            byfer[i]=array[i][Column];
            array[i][Column]=array[i][nextColumn];
            array[i][nextColumn]=byfer[i];

        }




        System.out.println("\n Вывод ");


        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                System.out.print(" " + array[i][j]+ " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();
    }
}