package by.peleng.java.lesson2;
/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/
import java.util.Scanner;

public class OneDimensional1  {
    public static void main(String args[]) {
        int[] array = {2, 5, 7, 8, 3, 0, 1};
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите  К:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число К ");
            in.next();
        }
        int first = in.nextInt();


        for (int i = 0; i <array.length; i++) {
            if (array[i] % first == 0 && array[i]!=0 ) {
                System.out.println("Число :" + array[i] + " Кратно " + first);
            }

        }


    }
}