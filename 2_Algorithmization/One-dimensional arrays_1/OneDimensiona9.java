package by.peleng.java.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/*9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.*/
public class OneDimensiona9 {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("задайте длинну последовательности:");


        while (!in.hasNextInt()) {
            System.out.print("Ввеедите длинну корректно:   ");
            in.next();
        }
        int size = in.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("последовательность: " + Arrays.toString(array));


        int[] finalArray = new int[size];


        for (int i = 0; i < array.length; i++) {
            int repeatCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeatCount++;
                }
                finalArray[i] = repeatCount;
            }
        }
        System.out.println("В массиве видим какой элемент сколько раз повторялся:" + Arrays.toString(finalArray));


        int mostRepeated = 0;//подсчитаем сколько больше всего повторкний
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] > mostRepeated) {
                mostRepeated = finalArray[i];
            }
        }
        System.out.println("Наибольшее число повторений: " + mostRepeated);

        int count = 0; //  количесво чисел c максимальным повторением
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] == mostRepeated) {
                count++;
            }
        }

        /*
        создадим массив из чисел которые повторялись чаще всего
         */

        int[] MostRep = new int[count];
        int j = 0; //итеатор для нового массива
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] == mostRepeated) {
                MostRep[j] = array[i];
                j++;
            }
        }
        System.out.println("Массив наиболее часто повторяющихся чисел (из первоначального массива) : " + Arrays.toString(MostRep));



        /*
        найдем ответ на данную задачу, а именно минмаьное сриди наиболее часто повторяющихся
         */
        int mostRepMin = MostRep[0];
        for (int i = 0; i < MostRep.length; i++) {
            if (MostRep[i] < mostRepMin) {
                mostRepMin = MostRep[i];
            }
        }

        System.out.println("Минимальное сриди наиболее повторяющихся чисел: " + mostRepMin);

    }


}







