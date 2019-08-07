package by.peleng.java.lessen3;

import java.util.ArrayList;
import java.util.Scanner;

/*8 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/
public class StringLesson8 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");


        String sytimg = in.nextLine();
//        StringBuffer stringBuffer = new StringBuffer(sytimg);
        ArrayList<Integer> probelNames = new ArrayList();
        int max = 0;
        int first = 0;
        int second = 0;
        probelNames.add(0);
        for (int i = 0; i < sytimg.length(); i++) {
            if (sytimg.charAt(i) == 32) {
                probelNames.add(i);
            }


        }
        probelNames.add(sytimg.length());
        for (int i = 0; i < probelNames.size() - 1; i++) {
            if (max < (probelNames.get(i + 1) - probelNames.get(i))) {
                max = (probelNames.get(i + 1) - probelNames.get(i) - 1);
                first = probelNames.get(i);
                second = probelNames.get(i + 1);
            }

        }

        System.out.println("    " + sytimg.substring(first, second));


    }
}