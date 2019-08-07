package by.peleng.java.lesson2;
/*4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
        из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Decomposition4 {

    static double distance(double x1, double x2, double y1, double y2) {

        return (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

    }


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        System.out.println("задайте число точек:");
        DecimalFormat dec = new DecimalFormat("#0.00");

        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно число точек:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] arrayХ = new int[size];
        int[] arrayY = new int[size];

        Random random = new Random();

        for (int j = 0; j < arrayХ.length; j++) {//идём по столбцам
            arrayХ[j] = random.nextInt(150);

            arrayY[j] = random.nextInt(150);


        }

        System.out.println("Координаты по Х: " + Arrays.toString(arrayХ));
        System.out.println("Координаты по Х:" + Arrays.toString(arrayY));

        double max = 0;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;


        for (int j = 0; j < arrayХ.length - 1; j++) {//идём по столбцам
            if (max < distance(arrayХ[j], arrayХ[j + 1], arrayY[j], arrayY[j + 1])) {

                max = distance(arrayХ[j], arrayХ[j + 1], arrayY[j], arrayY[j + 1]);

                x1 = arrayХ[j];
                x2 = arrayХ[j + 1];
                y1 = arrayY[j];
                y2 = arrayY[j + 1];

            }
        }
        if (max < distance(arrayХ[0], arrayХ[arrayY.length - 1], arrayY[0], arrayY[arrayY.length - 1])) {

            max = distance(arrayХ[0], arrayХ[arrayY.length - 1], arrayY[0], arrayY[arrayY.length - 1]);

            x1 = arrayХ[0];
            x2 = arrayХ[arrayХ.length - 1];
            y1 = arrayY[0];
            y2 = arrayY[arrayY.length - 1];


        }

        int[] itog = new int[]{x1, y1, x2, x2};

        System.out.println("Максимальное расстояние между точками:  " + dec.format(max) +
                " между точками  x1: " + x1 + " y1: " + y1 + " и  x2: " + x2 + " у2: " + y2);


    }

}