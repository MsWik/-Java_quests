package by.peleng.java.lesson2;

/*Сортировка вставками. Дана последовательность чисел
/*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort5 {
    public static int binarySearch(int[] array, int value, int right) {
        int left = 0;
        int mid = 0;
        while (left != right) {
            mid = (left + right) / 2;

            if (mid == 0 && array[mid] <= value) {
                return 0;
            } else if (array[mid] < value && array[mid - 1] >= value) {
                return mid;
            }
            if (array[mid] > value) {
                left = mid + 1;
            }
            if (array[mid] < value) {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте размер массива:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите размер корректно:   ");
            in.next();
        }
        int size = in.nextInt();


        int[] array = new int[size];
        int max = 0;

        Random random = new Random();

        for (int j = 0; j < array.length; j++) {//идём по столбцам
            array[j] = random.nextInt(150);
            System.out.print(" " + array[j] + " "); //вывод элемента
        }
        System.out.println();//перенос строки ради визуального сохранения табличной формы


/*        for(int i=1;i<array.length;i++) {
            int index = binarySearch(array,array[i],i - 1);
            for(int j = i;j > index;j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }*/

    for (int k = 1; k < array.length; k++) {
            int newElement = array[k];
            int location = k - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }


        System.out.println("Результат: " + Arrays.toString(array));
    }
}