package by.peleng.java.lesson2;
/*10. Найти положительные элементы главной диагонали квадратной матрицы*/
import java.util.Random;
import java.util.Scanner;

public class ArroyTwo10 {
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
        for (int i = 0; i < array.length; i++) {  //идём по строкам
            for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                array[i][j] = random.nextInt(100)-50;

                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        System.out.println();


        System.out.println("\nПоложительные элементы главной диагонали: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i]>0){
            System.out.print(" " + array[i][i] + " ");}

        }
    }

}
