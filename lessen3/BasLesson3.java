package by.peleng.java.lessen3;
/*3. В строке найти количество цифр.*/
public class BasLesson3 {
    public static void main(String[] args) {
            int key = 0; /// счетчик
        String input = "Hellow World 12548";
        char[] ch =input.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if(c > 47 && c < 58){
               key++;  //ищем все символы которые соответствуют символу числа
            }

        }





        System.out.println(key);// нашел - выведет true


    }

}
