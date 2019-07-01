package by.peleng.java.lesson1;

import java.util.Scanner;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/
public class Linear4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввеедите число Х:   ");
        while (!in.hasNextDouble()) {
            System.out.print("Ввеедите число Х:   ");
            in.next();
        }
        double numb = in.nextDouble();

        int x = (int) numb;
        double y = (numb * 1000) % 1000;
        double result = y + ((double) x / 1000);
        System.out.println(result);

    }

}
