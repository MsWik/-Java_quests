package by.peleng.java.lessen3;

import java.util.Scanner;

/*9 Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/
public class StringLesson9 {
    public static void main(String[] args) {
        String result = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");


        String sytimg = in.nextLine();
        int loverCase = 0;
        int upperCase = 0;
        for (int i = 0; i < sytimg.length(); i++) {
            String test = sytimg.substring(i, i + 1);
            boolean provercaUp = !test.equals(test.toLowerCase());
            boolean provercaLov = !test.equals(test.toUpperCase());

            if (provercaUp) {
                loverCase++;
            }
            if (provercaLov) {
                upperCase++;

            }

        }

        System.out.println("Букв в верхнем регистре:   " + loverCase + "\nБукв в нижним регистре:    " + upperCase);
    }


}
