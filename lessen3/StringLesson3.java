package by.peleng.java.lessen3;


/*3. Проверить, является ли заданное слово палиндромом.*/

public class StringLesson3 {

    public static void main(String[] args) {
    //    int resylt;
        boolean res;
        res = true;

        String s = "AABSSBGA";
        int n = s.length();

        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                res = false;
            }
        }

        System.out.println(res);
    }


}


