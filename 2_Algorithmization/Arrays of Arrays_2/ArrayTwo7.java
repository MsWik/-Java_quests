package by.peleng.java.lesson2;
/*7. Сформировать квадратную матрицу порядка N по правилу:*/
import java.util.Scanner;

public class ArrayTwo7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.println("задайте размер матрицы:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();
        int counter=0;


            double[][] array = new double[size][size];



            for (int i=0;i<array.length;i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j]=Math.sin((i*i+j*j)/array.length);
                    if (array[i][j]>0) {counter++;}
                }
            }



            System.out.println("\nНиже представлена матрица с нужными элементами");
            for (int i = 0; i < array.length; i++) {  //идём по строкам
                for (int j = 0; j < array[i].length; j++) {//идём по столбцам


                    System.out.print(" " + Math.round(array[i][j]*100)/100.f + " "); //вывод элемента
                }
                System.out.println();//перенос строки ради визуального сохранения табличной формы
            }

            System.out.println();


        System.out.println("\nчисло моложительных элементов матрицы   :" + counter );




    }



}
