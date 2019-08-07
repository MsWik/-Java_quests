package by.peleng.java.lesson1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/
public class Cycles8 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите  А:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число А ");
            in.next();
        }
        int first = in.nextInt();

        int[] digits = Integer.toString(first).chars().map(c -> c - '0').toArray();


        System.out.print("Ввеедите  В:   ");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректное число В ");
            in.next();
        }
        int second = in.nextInt();
        int[] digits2 = Integer.toString(second).chars().map(c -> c - '0').toArray();
        in.close();


        int i = 0, j = 0, k = 0;
       // int[] arr = new int[Math.max(digits.length, digits2.length)];
        Set<Integer> finalSet=new HashSet<>();
       /* while (i < digits.length && j < digits2.length) {
            if (digits[i] < digits2[j]) {
                i++;
            } else if (digits[i] > digits2[j]) {
                j++;
            } else {
                arr[k++] = digits[i++];
                j++;
            }
        }*/

        for (i=0;i<digits.length;i++){
            for (j=0;j<digits2.length;j++){
                if (digits[i] == digits2[j]){ finalSet.add(digits[i]);


                break;}

            }


        }

        for (Integer integer:finalSet) {

                System.out.print(integer + "  ");

        }


    }
}