package by.peleng.java.lessen3;

import java.util.Scanner;

/*7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
        def", то должно быть выведено "abcdef".*/

public class StringLesson7 {
    /*String deleteCharacters(String str, int from, int to) {
        return str.substring(0,from)+str.substring(to);
    }*/
    public static void main(String[] args) {
        String result;

        Scanner in = new Scanner(System.in);
        // System.out.println("Введите строку ");
        //sytimg = in.nextLine();
        String sytimg = "gts stg fgt sdhjcgtr tring";
        StringBuffer stringBuffer = new StringBuffer(sytimg);


        for (int i = 0; i < stringBuffer.length(); i++) {
            for (int j = i + 1; j < stringBuffer.length() - 1; j++) {
                if (stringBuffer.charAt(i) == stringBuffer.charAt(j)) {
                    stringBuffer.delete(j, j + 1);

                }


            }


        }


        result = stringBuffer.toString();
        result = result.replaceAll("\\s+", "");

        //  result = result.replaceAll("([ ])\\1", "");
        System.out.println(result);
    }


}
