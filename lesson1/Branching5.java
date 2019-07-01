package by.peleng.java.lesson1;
/* Вычислить значение функции:*/
import java.util.Scanner;

public class Branching5 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        s.close();

        double res = 0;
        if (x <= 3) {
            res = x * x - 3 * x + 9;
            System.out.println(res);
        } else {
            res = 1 / (Math.pow(x, 3) + 6);
            System.out.println(res);
        }
    }
}
