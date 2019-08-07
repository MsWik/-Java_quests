package by.peleng.java.lessen3;

/*2. Замените в строке все вхождения 'word' на 'letter'.*/
public class BasLesson2 {
    public static void main(String[] args) {
        String str = "HelloWorld   ";

        char[] strToChar = str.toCharArray();
        String newstr = "Letter";
        char[] newStrToChar = newstr.toCharArray();

        char[] fin = new char[strToChar.length * 2];

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (strToChar[i] == 'W') {
                for (int j = i, k = 0; j < i + newStrToChar.length; j++, k++) {

                    fin[j] = newStrToChar[k];
                    if (j == i + newStrToChar.length - 1) {
                        i += newStrToChar.length;
                        sum++;
                        break;
                    }

                }


            } else {
                fin[i + sum] = strToChar[i - sum];
            }
            ;


        }

        System.out.println(String.valueOf(fin) + "  " + sum);
        // System.out.println(Str.replaceAll("Hello", "Letter"));//Меняем Одно слово на другое и выводим


    }

}

