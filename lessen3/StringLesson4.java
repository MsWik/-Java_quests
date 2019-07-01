package by.peleng.java.lessen3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/
public class StringLesson4 {

    public static void main(String[] args) {
        String myString = "информатика";
        int indexJava1 = myString.indexOf("т");
        int indexJava2 = myString.indexOf("о");
        int indexJava3 = myString.indexOf("р");
        int indexJava4 = myString.indexOf("т");

        System.out.println(myString.substring(indexJava1, indexJava1 + 1) + myString.substring(indexJava2, indexJava2 + 1)
                + myString.substring(indexJava3, indexJava3 + 1) + myString.substring(indexJava4, indexJava4 + 1));


        Pattern pattern = Pattern.compile("[т]");
        Matcher matcher = pattern.matcher(myString);

        while (matcher.find()) {
            System.out.print(myString.substring(matcher.start(), matcher.end()));
        }


        Pattern pattern1 = Pattern.compile("[о]");
        Matcher matcher1 = pattern1.matcher(myString);

        while (matcher1.find()) {
            System.out.print(myString.substring(matcher1.start(), matcher1.end()));
        }

        Pattern pattern2 = Pattern.compile("[р]");
        Matcher matcher2 = pattern2.matcher(myString);

        while (matcher2.find()) {
            System.out.print(myString.substring(matcher2.start(), matcher2.end()));
        }
        Pattern pattern3 = Pattern.compile("[т]");
        Matcher matcher3 = pattern3.matcher(myString);

        while (matcher3.find()) {
            System.out.print(myString.substring(matcher3.start(), matcher3.end()));
        }
        System.out.println();


    }
}
