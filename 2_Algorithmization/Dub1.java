package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Scanner;
//Проверка разница максимального и минимальной и минимальной цифры в числе на четность
public class Dub1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");


        while (!in.hasNextInt()) {// проверяем что ввели число
            System.out.print("Введите число корректно   ");
            in.next();
        }

        int size = in.nextInt();
        int[]digits = Integer.toString(size).chars().map(c -> c-'0').toArray();//Переводим число в массив с использованием потока
        Arrays.sort(digits);//Сортируем массив
        System.out.println(Arrays.toString(digits));//Для наглядности выводим массив
        if ((digits[digits.length-1]-digits[0])%2==0){System.out.println("Четное число");} else
        {System.out.println("Не честное число");}

    }
}