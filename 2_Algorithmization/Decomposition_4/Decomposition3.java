package by.peleng.java.lesson2;
/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        положительных и нулевых элементов.*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Decomposition3 {


    static double triangle(double s){

        return (Math.sqrt(3)/4)*Math.pow(s,2);

    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте А:");
        DecimalFormat dec = new DecimalFormat("#0.00");

        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно А:   ");
            in.next();
        }
        int sizeA = in.nextInt();

        double result = triangle(sizeA)*6;
        System.out.println("Площадь равна "+  dec.format(result));



    }
}