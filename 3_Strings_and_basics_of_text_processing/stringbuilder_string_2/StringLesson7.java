package by.peleng.java.lessen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
        def", то должно быть выведено "abcdef".*/

public class StringLesson7 {




    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string: ");

        String str = reader.readLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                boolean k = true;
                for (int j = 0; j < newStr.length(); j++) {
                    if (str.charAt(i) == newStr.charAt(j)) {
                        k = false;
                        break;
                    }
                }

                if (k) {
                    newStr += str.charAt(i);
                }
            }
        }

        System.out.println(newStr);
    }
    }

