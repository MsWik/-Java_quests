package by.peleng.java.lesson1;
/*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Cycles7 {


    public static void cel(int n, int m) {
        if (m > 2 && n > 2 && m - n >= 0) {
            for (int i = n; i <= m; i++) {
                int pr = 0;
                System.out.print("\n  для числа    " + i + "    :\n");
                for (int j = 2; j < (int) i / 2 + 1; j++) {
                    if (i % j == 0) {
                        System.out.print(" " + j + "  ");
                        pr++;
                    }
                }

                if (pr == 0) {
                    System.out.print("   число простое   ");
                }


            }

            /* for (; n < m; n++) {
                int x = 2;
                int z = n;
                int pr = 0;
                System.out.println("для числа" + n);
                while (z != 1) {
                    if (z % x == 0 && z != x) {
                        System.out.print("*" + x + "*");
                        z = z / x;
                        pr++;
                    }
                    if (z == x) {
                        if (pr != 0) System.out.print("*" + x + "*");
                        else System.out.print("только 1 и само числ");
                        break;
                    }
                    x++;

                }
                System.out.println(" ");
            }*/
        } else System.out.println("число меньше  2");
    }

    public static void main(String[] args) {

        int n;
        int m;
        System.out.println("введи меньшее число n");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("//");
        System.out.println("введи большее число m");
        Scanner ss = new Scanner(System.in);
        m = ss.nextInt();
        cel(n, m);
    }
}
