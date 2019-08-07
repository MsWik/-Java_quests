package by.peleng.java.lesson2;
/*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
        Делается это следующим образом: сравниваются два соседних элемента
        ai и ai+1
        . Если
        ai  ai+1
        , то продвигаются
        на один элемент вперед. Если
        ai  ai+1
        , то производится перестановка и сдвигаются на один элемент назад.
        Составить алгоритм этой сортировки.*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Masiv_Sort6 {
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
            array[j] = random.nextInt(150) - 75;
            System.out.print(" " + array[j] + " "); //вывод элемента
        }
        System.out.println();//перенос строки ради визуального сохранения табличной формы

        for (int i = 0; i < array.length - 1; i++) {
            int key;
            if (array[i] > array[i + 1]) {
                key = array[i];
                array[i] = array[i + 1];
                array[i + 1] = key;
                if (i > 0) {
                    i -= 2;
                }
            }
        }


        System.out.println("Результат: " + Arrays.toString(array));


    }
}