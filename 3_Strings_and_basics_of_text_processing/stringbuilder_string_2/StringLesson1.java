package by.peleng.java.lessen3;

import java.util.Scanner;

public class StringLesson1 {
    /*1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Введите строку N:");
        String str = in.toString();


        int spaceCount = 0;
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int kel = i;

            if ((str.charAt(i) == ' ')) {
                while (str.charAt(kel) == ' ') {
                    spaceCount++;
                    kel++;

                }
                if (max < spaceCount) {
                    max = spaceCount;
                }
                spaceCount = 0;
            }


        }


        System.out.println(max);
    }
}
