package by.peleng.java.lessen3;

/*5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class StringLesson5 {
    public static void main(String[] args) {
        StringBuffer myText = new StringBuffer(" dhfbjgshf sdfsdafsd sdfsabdf   asdbsd  b  b  dsfsd    fd ");
        int key = 0;
        for (int i = 0; i < myText.length(); i++) {
            char ch = myText.charAt(i);
            if (ch == 'a') {
                key++;


            }

        }
        System.out.println(key);
    }
}
