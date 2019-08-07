package by.peleng.java.lessen3;

/*6. Из заданной строки получить новую, повторив каждый символ дважды.*/
public class StringLesson6 {
    public static void main(String[] args) {
        String old = "AS ds GF";
        String newstring = "";
        for (int i = 0; i < old.length(); i++) {
            char ch = old.charAt(i);
            newstring = newstring + ch + ch;

        }
        System.out.println(newstring);


    }
}