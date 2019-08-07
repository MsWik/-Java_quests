
package by.peleng.java.lessen3;

/*4. В строке найти количество чисел.*/
public class BasLesson4 {
    public static void main(String[] args) {
        int key = 0; /// счетчик
        String input = "Hellow World 1 12548 256 ";
        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            int j = i + 1;
            char c = ch[i];
            char d = ch[j];
            if (Character.isDigit(c) & !Character.isDigit(d)) {
                key++;  //ищем все символы которые соответствуют символу числа
            }

        }


        System.out.println(key);// нашел - выведет true


    }

}